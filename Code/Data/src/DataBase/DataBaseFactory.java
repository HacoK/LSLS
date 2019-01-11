package DataBase;

public interface DataBaseFactory {
	UserDataService getUserDatabase();
	CommodityService getCommodityService();
	ClientService getClientService();
	PromotionService getPromotionService();
	AccountService getAccountService();
	BookService getBookService();
}
//Use Service to get and update data
interface UserDataService{}
interface CommodityService{}
interface ClientService{}
interface PromotionService{}
interface AccountService{}
interface BookService{}