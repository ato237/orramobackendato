package ato.orramo.orramobackend.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DatabaseService {

    @Autowired
    DatabaseRepository databaseRepository;

    @Override
    public Database saveDatabase(Database database) {
        return databaseRepository.save(database);
    }
}
