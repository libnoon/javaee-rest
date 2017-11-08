// from Sebastian Daschner's talk "Java EE the most lightweight enterprise framework"
package fr.fbauzac.boil;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {
    
}
