package luyen_tap_de_3.service;

import luyen_tap_de_3.utils.NotFoundProductException;

public interface IService {
    void creat();
    void delete(String string) throws NotFoundProductException;
    void find();
    void display();
}
