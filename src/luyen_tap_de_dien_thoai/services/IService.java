package luyen_tap_de_dien_thoai.services;

import luyen_tap_de_dien_thoai.utils.NotFoundProductException;

public interface IService {
    void creat();
    void display();
    void delete(String str) throws NotFoundProductException;
    void find();
}
