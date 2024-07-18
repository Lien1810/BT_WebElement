public class AddNewCustomer {
    //Trang Login cơ bản
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";

    //Hiển thị trang Dashbroad
    public static String menuDashboard = "//ul[@id='side-menu']//span[normalize-space()='Dashboard']"; //Chú ý nên lấy cả xpath của menu để định vị chính xác và dễ bảo trì sau này

    //nút Customers trong menu
    public static String menuCustomer = "//ul[@id='side-menu']//span[normalize-space()='Customers']";
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    //Màn List Customer
    public static String headerCustomersPage = "//span[normalize-space()='Customers Summary']";

    //Màn New Customer
    public static String inputCompany = "//input[@id='company']";
    public static String inputVATNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroup = "//button[@data-id='groups_in[]']";
    public static String searchGroup = "//button[@data-id='groups_in[]']/following-sibling::div//input";
    public static String selectGroup = "//a[.='VIP']"; //Chọn giá trị VIP trong list Group
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public static String inputDefaultLanguage = "//span[normalize-space()='System Default']";
    public static String inputAdress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String searchCountry = "//div[@app-field-wrapper='country']//input[@type='search']";
    public static String buttonSaveandCreateContact = "//div[@id='profile-save-section']/child::button[normalize-space()='Save and create contact']";
    public static String buttonSave = "//div[@id='profile-save-section']/child::button[normalize-space()='Save']";

}
