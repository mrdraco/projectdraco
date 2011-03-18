package chris.sky;

public class SkyAction extends TvPackage {

    public static void main(String[] args) {
        SkyBasket basket = new SkyBasket();
        BroadBandPackage slow = new BroadBandLight();
        slow.speed = 2;
        slow.price = 10;
        slow.downloadlimit = 4;
        TvPackage movies = new TvPackage();
        movies.type = "movies";
        movies.price = 20;
        TvPackage learning = new TvPackage();
        learning.type = "learning";
        basket.addBroadBandPackage(slow);
        basket.addTvPackage(movies);
        basket.checkout();
    }
}
