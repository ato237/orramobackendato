package ato.orramo.orramobackend.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DatabaseService {
  public Database saveDatabase(Database database);
}
