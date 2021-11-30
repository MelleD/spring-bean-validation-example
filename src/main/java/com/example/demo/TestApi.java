package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Class is generated
 */
public interface TestApi {

   @GetMapping( "/{source}" )
   ResponseEntity<Foo> test( @PathVariable( "source" ) final String source );
}
