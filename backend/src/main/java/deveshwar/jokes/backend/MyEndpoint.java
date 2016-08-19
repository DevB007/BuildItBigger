/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package deveshwar.jokes.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import deveshwar.lib.Joke;
import deveshwar.lib.JokeFactory;

/** An endpoint class we are exposing */
@Api(
  name = "jokeApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.jokes.deveshwar",
    ownerName = "backend.jokes.deveshwar",
    packagePath=""
  )
)
public class MyEndpoint {
    /**
     * A simple endpoint method that return some joke
     */
    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        return JokeFactory.getSomeJoke();
    }
}
