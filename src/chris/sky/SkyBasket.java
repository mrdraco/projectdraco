package chris.sky;

public class SkyBasket {
    private BroadBandPackage broadbandpackage;
    private  TvPackage tvpackage;

    public void addBroadBandPackage(BroadBandPackage a){
        broadbandpackage = a;

    }
    public void addTvPackage(TvPackage b){
        tvpackage = b;
    }
    public void checkout(){
        System.out.println("You have purchased " + broadbandpackage.speed +" "+ tvpackage.type);
        int totalprice = broadbandpackage.price + tvpackage.price;
        System.out.println("Your total price is £ " + totalprice+" ");
    }
}
