package testNG_Training;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;

public class MoneyTest{
@DataProvider
private static final Object[][] getMoney(){
		return new Object[][]{
			{10, "USD"},
			{20, "EUR"}
		};
}
@Test(dataProvider = "getMoney")
public void constructorShouldSetAmountAndCurrency(int amount, String currency){
	Money money = new Money(amount, currency);
	assertEquals(money.getAmount(), amount);
	assertEquals(money.getCurrency(), currency);
	}
}
























