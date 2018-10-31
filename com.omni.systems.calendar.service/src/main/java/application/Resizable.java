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
package application;

//import lombok.AllArgsConstructor;
//import lombok.Data;

/**
 * @author Billy Bissic
 *
 */

//@AllArgsConstructor
//@Data
public class Resizable {

	private boolean beforeStart;
	private boolean afterEnd;
	
	/**
	 * @return the beforeStart
	 */
	public boolean isBeforeStart() {
		return beforeStart;
	}
	/**
	 * @param beforeStart the beforeStart to set
	 */
	public void setBeforeStart(boolean beforeStart) {
		this.beforeStart = beforeStart;
	}
	/**
	 * @return the afterEnd
	 */
	public boolean isAfterEnd() {
		return afterEnd;
	}
	/**
	 * @param afterEnd the afterEnd to set
	 */
	public void setAfterEnd(boolean afterEnd) {
		this.afterEnd = afterEnd;
	}
	
	/*public Resizable(final boolean beforeStart, final boolean afterEnd) {
		this.beforeStart = beforeStart;
		this.afterEnd = afterEnd;
	}*/
	
	/**
	 * @return the beforeStart
	 */
	//public boolean isBeforeStart() { return beforeStart; }
	/**
	 * @param beforeStart the beforeStart to set
	 */
	//public void setBeforeStart(boolean beforeStart) { this.beforeStart = beforeStart; }
	/**
	 * @return the afterEnd
	 */
	//public boolean isAfterEnd() { return afterEnd; }
	/**
	 * @param afterEnd the afterEnd to set
	 */
	//public void setAfterEnd(boolean afterEnd) { this.afterEnd = afterEnd; }
}