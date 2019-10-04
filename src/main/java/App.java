
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap();
            return new ModelAndView(model, "land.hbs");
        }, new HandlebarsTemplateEngine());

        post("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            String name = request.queryParams("name");
//            String email = request.queryParams("email");
////           String phone = request.queryParams("phone");
//            String location = request.queryParams("location");
//            land adress = new land(name, email, location);
//            model.put("adress", adress);
//            model.put("name", name);
//            model.put("email", email);
////            model.put("phone",phone );
//            model.put("location", location);
            return new ModelAndView(model, "land.hbs");
        }, new HandlebarsTemplateEngine());

        get("/photo/new", (request, response) -> {
            Map<String, Object> model = new HashMap();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/photo/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String photos = request.queryParams("photos");
            land photoli= new land(photos);

            model.put("photoli", photoli);
            model.put("photos", photos);
            return new ModelAndView(model, "Allphoto.hbs");
        }, new HandlebarsTemplateEngine());


        get("/form/new", (request, response) -> {
            Map<String, Object> model = new HashMap();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());


    }
}