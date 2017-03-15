/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class HouseMediator extends Mediator {
    //中介者知道所有同事
    private Landlord landlord;
    private Tenant tenant;

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override void contact(People people, String msg) {
        if(people == tenant) {
            tenant.getMessage(msg);
        } else {
            landlord.getMessage(msg);
        }
    }
}
