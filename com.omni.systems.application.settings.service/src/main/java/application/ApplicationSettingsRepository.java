package application;

import org.springframework.data.repository.CrudRepository;

public interface ApplicationSettingsRepository extends CrudRepository<ApplicationSettings, Long>{

	Iterable<ApplicationSettings> findByApplicationName(String applicationname);
	Iterable<ApplicationSettings> findByApplicationSettingName(String applicationsettingname);
	Iterable<ApplicationSettings> findByApplicationSettingsId(Integer applicationsettingsid);
}
