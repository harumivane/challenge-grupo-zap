package com.harumivane.grupozap.requisicao;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harumivane.grupozap.entities.Property;

@RestController
@RequestMapping(value="/property")
public class PropertyRequest {

	/*@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Property> insert(@RequestBody JSONObject jsonProperty) {

	}
	*/
}
