package newPerson;

import java.io.IOException;
import java.util.ArrayList;

interface Person {
    public ArrayList<NhanVien> FileToInput(String linkFileInput) throws IOException;
    public void outP(NhanVien p);
}
