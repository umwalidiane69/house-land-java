import org.junit.rules.ExternalResource;
import org.sql2o.*;

class DatabaseRule extends ExternalResource {

    @Override
    protected void before() {
//        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/virtual_pets_test", "wecode", "1234");  //Those with linux or windows use two strings for username and password
    }
}