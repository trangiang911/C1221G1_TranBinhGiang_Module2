package luyen_tap_de.services;

import luyen_tap_de.utils.NotFoundProductException;

public interface IService {
    void creat();
    void display();
    void delete(String str) throws NotFoundProductException;
    void find();
}
