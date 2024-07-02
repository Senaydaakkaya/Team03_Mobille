package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class QueryCardPage {
   public QueryCardPage(){
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
    }

   //ihsan
   @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']")
   public WebElement profileButton;
   @AndroidFindBy(xpath = "//android.widget.EditText[1]")
   public WebElement emailBox;
   @AndroidFindBy(xpath = "//android.widget.EditText[2]")
   public WebElement passwordBox;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign In'])[1]")
   public WebElement signText;
   @AndroidFindBy(xpath = "//*[@content-desc='*Use Email Instead']")
   public WebElement useEmail;
   @AndroidFindBy(xpath = "//*[@content-desc='Sign Up']")
   public WebElement signUpButton;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[1]")
   public WebElement nameBox;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[2]")
   public WebElement emailBox2;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[3]")
   public WebElement passwordBox2;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[1]")
   public WebElement signUp1;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[2]")
   public WebElement signUp2;
   @AndroidFindBy(xpath = "//*[@content-desc='This field is required']")
   public WebElement blankAlert;
   @AndroidFindBy(xpath = "(//*[@index='1'])[3]")
   public WebElement productHeader;
   @AndroidFindBy(xpath = "//*[@content-desc='Product Details']")
   public WebElement productDetails;
   @AndroidFindBy(xpath = "//*[@index='10']")
   public WebElement productDetailsContext;
   @AndroidFindBy(xpath = "//*[@content-desc='Videos']")
   public WebElement videosButton;
   @AndroidFindBy(xpath = "//*[@content-desc='Product Videos']")
   public WebElement videosTitle;
   @AndroidFindBy(xpath = "//*[@content-desc='Review']")
   public WebElement reviewButton;
   @AndroidFindBy(xpath = "//*[@content-desc='Product Reviews']")
   public WebElement reviewTitle;
   @AndroidFindBy(xpath = "//*[@content-desc='Shipping & Return']")
   public WebElement shippingButton;
   @AndroidFindBy(xpath = "(//*[@content-desc='Shipping & Return'])[2]")
   public WebElement shippingTitle;
   @AndroidFindBy(xpath = "//*[@content-desc='Order History']")
   public WebElement orderHistory;
   @AndroidFindBy(xpath = " //*[@content-desc='Your Order status is as follows']")
   public WebElement orderHistoryPage;
   @AndroidFindBy(xpath = "//*[@content-desc='Download Receipt']")
   public WebElement downloadReceipt;
   @AndroidFindBy(xpath = "//(//*[@content-desc='QueryCart - Shop Smarter, Live Better'])[1]")
   public WebElement receipt;
   @AndroidFindBy(xpath = "//*[@content-desc='Cancel Order']")
   public WebElement cancelOrder;
   @AndroidFindBy(xpath = "//*[@content-desc='Order Canceled']")
   public WebElement canceledOrder;
   @AndroidFindBy(xpath = "//*[@content-desc='S']")
   public WebElement size;
   @AndroidFindBy(xpath = "//*[@content-desc='Add To Cart']")
   public WebElement addToCartButton;
   @AndroidFindBy(xpath = "//*[@content-desc='Proceed to Checkout']")
   public WebElement proceedToCheckout;
   @AndroidFindBy(xpath = "//*[@content-desc='Save & Pay']")
   public WebElement savePay;
   @AndroidFindBy(xpath = "//*[@content-desc='Select Payment Method']")
   public WebElement paymentMethod;
   @AndroidFindBy(xpath = "//*[@content-desc='Stripe']")
   public WebElement stripe;
   @AndroidFindBy(xpath = "//*[@content-desc='Confirm Order']")
   public WebElement confirmOrderButton;

   //===================================================================================================================
   //reyyan

   @AndroidFindBy(xpath = "//*[@content-desc='Women']")
   public WebElement womanButton;
   @AndroidFindBy(accessibility = "Casual Women Shoes")
   public WebElement womanShoes;
   @AndroidFindBy(accessibility= "White")
   public WebElement colorWhite;
   @AndroidFindBy(accessibility = "Quantity:")
   public WebElement quantity;
   @AndroidFindBy(accessibility = "Change Password")
   public WebElement changePassword;
   @AndroidFindBy(accessibility = "Total Orders")
   public WebElement summaryInformation;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[1]")
   public WebElement oldPasswordBox;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[2]")
   public WebElement newPasswordBox;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[3]")
   public WebElement confirmPasswordBox;
   @AndroidFindBy(accessibility = "Save Changes")
   public WebElement saveChanges;
   @AndroidFindBy(accessibility = "Reyyan Mert")
   public WebElement passwordChangeVerify;
   @AndroidFindBy(accessibility = "Password not matched")
   public WebElement notMatchedText;
   @AndroidFindBy(xpath = "(//android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView)[3]")
   public WebElement cartIcon;
   @AndroidFindBy(accessibility = "Shopping Cart")
   public WebElement productVerifyPage;
   @AndroidFindBy(accessibility = "Subtotal")
   public WebElement subtotalVerify;
   @AndroidFindBy(accessibility = "Remove")
   public WebElement productDelete;
   @AndroidFindBy(accessibility = "Go to Shopping")
   public WebElement goToShopping;
   @AndroidFindBy(xpath = "//android.view.View[@content-desc='The North Face Arctic Parka 0 (0  Reviews) $400.00']")
   public WebElement productArcticParkaHomePage;
   @AndroidFindBy(xpath = "//android.view.View[@content-desc='Floral Print Midi Dress 0 (0  Reviews) $100.00']")
   public WebElement productmidiDressHomePage;
   @AndroidFindBy(accessibility = "M")
   public WebElement productSizeHomePage;
   @AndroidFindBy(accessibility = "Add To Cart")
   public WebElement addToCartHomePage;
   @AndroidFindBy(accessibility = "Payment Information")
   public WebElement paymentInformation;
   @AndroidFindBy(accessibility = "See All")
   public WebElement seeAll;





   //===================================================================================================================
   //senayda
   @AndroidFindBy (xpath = "(//android.view.View[1]/android.widget.ImageView[1])[1]")
   public WebElement homePageLogo;
   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Most Popular\"]")
   public WebElement mostPopularLabel;
   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"S\"]")
   public WebElement sizeS;
   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"1\"]")
   public WebElement quantityNumber;
   @AndroidFindBy (xpath = "(//*[@class='android.view.View'])[8]")
   public WebElement shoppingCart;
   @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Address\"]")
   public WebElement addressButton;
   @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Add New Address\"]")
   public WebElement addNewAddressButton;
   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Country\"]")
   public WebElement countryBox;
   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"State\"]")
   public WebElement stateBox;
   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"City\"]")
   public WebElement cityBox;
   @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[4]")
   public WebElement zipCodeBox;
   @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.View/android.widget.EditText[5]")
   public WebElement streetAddressBox;

   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Sign In\"]")
   public WebElement signInButton;

   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
   public WebElement useEmailInsteadButton;

   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Forgot Password\"]")
   public WebElement forgotPasswordButton;

   @AndroidFindBy (xpath = "//android.widget.EditText")
   public WebElement emailTextBox;

   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Get OTP\"]")
   public WebElement getOTPButton;

   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Back to sign in\"]")
   public WebElement backToSignInButton;

   @AndroidFindBy (xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
   public WebElement newPasswordTextBox;

   @AndroidFindBy (xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
   public WebElement confirmPasswordTextBox;

   @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Submit\"]")
   public WebElement submitButton;

   //===================================================================================================================
   //Azim
   @AndroidFindBy(xpath ="//android.view.View[@content-desc='Juniors']")
   public WebElement viewJuniors;
   @AndroidFindBy(xpath ="//android.widget.ScrollView")
   public WebElement JuniorsProduct;
   @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='Logout']")
   public WebElement logoutButton;
   @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='Wishlist']")
   public WebElement homePageWishlistButton;
   @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='Category']")
   public WebElement homePageCategoryButton;
   @AndroidFindBy(xpath ="(//*[@class='android.widget.ImageView'])[4]")
   public WebElement corapFavoriButton;
   @AndroidFindBy(xpath ="//android.view.View[@content-desc='Men']")
   public WebElement menButton;
   @AndroidFindBy(xpath ="(//*[@class='android.widget.ImageView'])[3]")
   public WebElement juniorFiltrelemeElementi;
   @AndroidFindBy(xpath ="(//*[@class='android.view.View'])[19]")
   public WebElement hompageBayankıyafetiElementi;
   @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='Add To Cart']")
   public WebElement addToCartElementi;
   @AndroidFindBy(xpath ="(//*[@class='android.widget.ImageView'])[13]")
   public WebElement cartİcon;
   @AndroidFindBy(xpath ="//*[@content-desc='Proceed to Checkout']")
   public WebElement proceedToCheckoutButton;
   @AndroidFindBy(xpath ="//*[@content-desc='Shipping Information']")
   public WebElement shippingInformationText;
   @AndroidFindBy(xpath ="//*[@content-desc='Delivery']")
   public WebElement deliveryButton;
   @AndroidFindBy(xpath ="//android.view.View[@content-desc='Pick Up']")
   public WebElement pickUpButton;
   @AndroidFindBy(xpath ="//*[@content-desc='Order Summary']")
   public WebElement orderSummaryText;
   @AndroidFindBy(xpath ="//*[@content-desc='Save & Pay']")
   public WebElement saveAndPayButton;
   @AndroidFindBy(xpath ="(//*[@class='android.widget.EditText'])[1]")
   public WebElement updateFulnameBoxe;
   @AndroidFindBy(xpath ="//android.widget.ScrollView/android.view.View/android.widget.EditText[1]")
   public WebElement addAdresFulnameBoxe;
   @AndroidFindBy(xpath ="//android.view.View[@content-desc='Sing In To See Your Info']")
   public WebElement singInToSeeYourInfoText ;
   @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']")
   public WebElement logoutprofileButton;
   @AndroidFindBy(xpath = "//android.view.View[@content-desc='(0  Products Found)']")
   public WebElement wislistProductsFoundText;
   //===================================================================================================================
   //hümeyra
   @AndroidFindBy(xpath ="//android.view.View[@content-desc='See All']")
   public WebElement seeAllIcon;
   // most popular baslıgın yanındaki see all iconuna tıklayınca açılan ürünlerin lokati
   @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]")
   public WebElement floralPrintMidiDress;
   @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[12]")
   public WebElement classicCottonTshirt;
   @AndroidFindBy(xpath = "//*[@content-desc='Men']")
   public WebElement manCategoryWindow;
   @AndroidFindBy(className = "android.widget.ScrollView")
   public WebElement adidas3StripesProduct;
   @AndroidFindBy(xpath = "//android.view.View[@content-desc='Black']")
   public WebElement blackColor;
   @AndroidFindBy(xpath = "//*[@text()='Success']")
   public WebElement successAlert;
   @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
   public WebElement filterIcon;
   @AndroidFindBy(xpath = "//*[@content-desc='Sort By']")
   public WebElement sortBy;
   @AndroidFindBy(xpath = "//*[@content-desc='Brands']")
   public WebElement brands;
   // filter icon
   @AndroidFindBy(xpath = "//*[@content-desc='size']")
   public WebElement Size;
   @AndroidFindBy(xpath = "//*[@content-desc='color']")
   public WebElement color;
   @AndroidFindBy(xpath = "//*[@content-desc='Price High To Low']")
   public WebElement priceHighToLow;
   @AndroidFindBy(xpath = "//android.view.View[@content-desc='Urban Casuals']")
   public WebElement urbanCasuals;
   @AndroidFindBy(xpath = "//android.view.View[@content-desc='(1 Products Found)']")
   public WebElement productFound;
   @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[16]")
   public WebElement Ssize;

   @AndroidFindBy(xpath = "//*[@content-desc='Edit Profile']")
   public WebElement editProfile;

   @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
   public WebElement fullNameBox;

   @AndroidFindBy(xpath = "//*//android.widget.EditText[3]")
   public WebElement phoneBox;

   @AndroidFindBy(xpath = "//android.view.View[@content-desc='Humeyra Tayfn']")
   public WebElement updatedName;

   @AndroidFindBy(xpath = "//*[@content-desc='Return Request']")
   public WebElement returnRequestButton;

   @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
   public WebElement productRadioButton;

   @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[5]")
   public WebElement returnReasonBox;

   @AndroidFindBy(xpath = "//*[@content-desc='Other']")
   public WebElement other;

   @AndroidFindBy(xpath = "//android.widget.EditText")
   public WebElement returnNote;

   @AndroidFindBy(xpath = "(//*[@content-desc='Request Return'])[2]")
   public WebElement requestReturnButton;

   //return orders sayfasındakı urunumun locati
   @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
   public WebElement returnProcess;

   @AndroidFindBy(xpath = "//*[@content-desc='Sign In']")
   public WebElement signIn;

   @AndroidFindBy(xpath = "//*[@content-desc='Forgot Password']")
   public WebElement forgotPassword;

   @AndroidFindBy(xpath = "//*[@content-desc='Forgot Password']")
   public WebElement forgotPasswordLabel;




   //===================================================================================================================
   //murat


}
