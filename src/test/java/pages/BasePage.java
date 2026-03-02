package pages;

import utils.PropertyReader;

public abstract class BasePage {
    public static final String BASE_URL = PropertyReader.getProperty("course.url");
    public static final String USER = PropertyReader.getProperty("course.user");
    public static final String PASSWORD = PropertyReader.getProperty("course.password");
}
