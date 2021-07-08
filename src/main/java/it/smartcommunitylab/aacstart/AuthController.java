package it.smartcommunitylab.aacstart;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping(value = "/whoami")
    public @ResponseBody Authentication debug(Authentication auth)
            throws IOException {

        return auth;

    }

}
