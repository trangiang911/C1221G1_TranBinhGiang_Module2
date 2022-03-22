package luyen_tap_de_4.services;

import luyen_tap_de_4.utils.NotFoundBankAccountException;

public interface IService {
    void creat();
    void delete(String string) throws NotFoundBankAccountException;
    void display();
    void find();
}
