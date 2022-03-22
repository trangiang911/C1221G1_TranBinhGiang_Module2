package luyen_tap_de_1.services;

import luyen_tap_de_1.utils.NotFoundProductException;

public interface IService {
    void creat();
    void display();
    void delete(String str) throws NotFoundProductException;
    void find();
}
