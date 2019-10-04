import org.sql2o.Connection;

import java.util.List;

public class land {
    private String photos;

//    private  String email;
//    private  int phone;
//    private  String location;


//    public land(String photos,String email,String location) {
//        this.photos = photos;
//        this.email = email;
//        this.phone = phone;
//        this.location = location;
//    }

    public land(String photos) {
        this.photos = photos;
    }


    public String getPhotos() {
        return photos;
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}