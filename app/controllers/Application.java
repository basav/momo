package controllers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

   public static Result phones(String phoneId) throws IOException {
    File jsonFile = Play.application().getFile("public/phones/"+phoneId);
    String json = FileUtils.readFileToString(jsonFile);
    return ok(json).as("application/json");
  }
  
}