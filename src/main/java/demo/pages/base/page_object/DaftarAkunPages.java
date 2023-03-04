package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class DaftarAkunPages extends BasePageObject{

    public void inputEmail(String username) {
        By element = By.id("email");
        typeOn(element, username);
    }

    public void inputNoHp(String nohp) {
        By element = By.id("mobilePhone");
        typeOn(element, nohp);
    }

    public void inputPass(String pass) {
        By element = By.id("password");
        typeOn(element, pass);
    }

    public void inputCPass(String cpass) {
        By element = By.id("confirmPassword");
        typeOn(element, cpass);
    }

    public void inputSName(String sname) {
        By element = By.id("firstName");
        typeOn(element, sname);
    }

    public void inputLName(String lname) {
        By element = By.id("lastName");
        typeOn(element, lname);
    }

    public void inputCity(String city) {
        By element = By.id("cityAndProvince");
        typeOn(element, city);
    }
}
