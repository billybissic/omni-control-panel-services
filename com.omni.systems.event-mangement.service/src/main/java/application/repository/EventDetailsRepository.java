/**
* MIT License
*
* Copyright (c) 2018 Billy Bissic
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
**/
package application.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import application.domain.EventDetails;

/**
 * @author Billy Bissic
 *
 */
public interface EventDetailsRepository extends CrudRepository<EventDetails, Integer> {

	/**
	 * @param id
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM EventDetails WHERE event_details_id = ?1")
	void deleteById(Integer id);

	/**
	 * @param event_id
	 * @return
	 */
	@Query("SELECT event_details_id, event_id, event_type_id, "
		 + "       event_status_id, event_host, event_location, event_date, "
		 + "       event_start_time, event_end_time, event_image_id, "
		 + "       last_changed_timestamp, last_updated_by "
		 + "  FROM EventDetails WHERE event_id = ?1")
	EventDetails findById(Integer event_id);

}
