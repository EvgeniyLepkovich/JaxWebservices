//package by.epam.config;
//
//import by.epam.controller.JaxrsTextController;
//import by.epam.controller.JaxrsXmlController;
//
//import javax.ws.rs.ApplicationPath;
//import javax.ws.rs.core.Application;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
////@ApplicationPath("/service")
//public class RestConfig extends Application {
//    private Set<Object> singletons = new HashSet<Object>();
//
//    public RestConfig() {
//        singletons.add(new JaxrsTextController());
//        singletons.add(new JaxrsXmlController());
//    }
//
//    @Override
//    public Set<Object> getSingletons() {
//        return singletons;
//    }
//
//    @Override
//    public Set<Class<?>> getClasses(){
//        return new HashSet<Class<?>>(Arrays.asList(JaxrsXmlController.class, JaxrsTextController.class));
//    }
//}
