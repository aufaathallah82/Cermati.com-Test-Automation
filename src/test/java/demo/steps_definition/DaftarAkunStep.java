package demo.steps_definition;

import demo.pages.base.page_object.DaftarAkunPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class DaftarAkunStep {

    DaftarAkunPages daftarAkunPages = new DaftarAkunPages();

    @Given("user input {string} at search email field")
    public void inputEmailAtEmailField(String username) {
        daftarAkunPages.inputEmail(username);

    }


    @And("user input {string} at search no hp field")
    public void inputNoHpAtNoHpField(String nohp) {
        daftarAkunPages.inputNoHp(nohp);
    }

    @And("user input {string} at search password field")
    public void inputPassAtPassField(String pass) {
        daftarAkunPages.inputPass(pass);
    }

    @And("user input {string} at search repeat password field")
    public void inputCPassAtCPassField(String cpass) {
        daftarAkunPages.inputCPass(cpass);
    }

    @And("user input {string} at search surname field")
    public void inputSNameAtSNameField(String sname) {
        daftarAkunPages.inputSName(sname);
    }

    @And("user input {string} at search lastname field")
    public void inputLNameAtLNameField(String lname) {
        daftarAkunPages.inputLName(lname);
    }

    @And("user input {string} at search city field")
    public void inputCityAtCityField(String city) {
        daftarAkunPages.inputCity(city);
    }
}