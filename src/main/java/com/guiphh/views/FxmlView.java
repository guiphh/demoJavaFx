package com.guiphh.views;

import java.util.ResourceBundle;

public enum FxmlView {

    USER {
        @Override
        public String getTitle() {
            //return "user title";
            return getStringFromResourceBundle("user.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/sample.fxml";
        }
    },
    LOGIN {
        @Override
        public String getTitle() {
            //return "login title";
            return getStringFromResourceBundle("login.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/login.fxml";
        }
    };

    public abstract String getTitle();

    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key) {
        return ResourceBundle.getBundle("Bundle").getString(key);
    }


}
