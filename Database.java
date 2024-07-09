interface DataStorage {
    void save(String data);
}

public class Database implements DataStorage {
    @Override
    public void save(String data) {
        // Lógica para guardar datos en la base de datos
    }
}

class DataService {
    private DataStorage dataStorage;

    public DataService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void saveData(String data) {
        dataStorage.save(data);
    }
}
