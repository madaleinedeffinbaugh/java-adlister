package dao;

import Configs.Config;
import dao.Ads;
import dao.MySQLAdsDao;


public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
//            adsDao = new dao.ListAdsDao();
        }
        return adsDao;
    }
}
