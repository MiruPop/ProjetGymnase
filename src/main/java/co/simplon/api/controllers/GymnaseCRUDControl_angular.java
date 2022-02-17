package co.simplon.api.controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.api.models.Gymnase;
import co.simplon.api.services.GymnaseServiceImpl;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/gymnase")
public class GymnaseCRUDControl_angular {

		@Autowired
		private GymnaseServiceImpl gymnaseService;

//		http://localhost:9000/gymnase/liste
		@GetMapping("/liste")
		public ResponseEntity<List<Gymnase>> trouveTousGymnases() {
			List<Gymnase> gymnases = gymnaseService.listeGyms();
			return new ResponseEntity<>(gymnases, HttpStatus.OK);
		}

//		http://localhost:9000/gymnase/find/566eec69662b388eba464299
		@GetMapping("/find/{id}")
		public ResponseEntity<Gymnase> trouveUnGymnase(@PathVariable("id") String id) {
			ObjectId objectId = new ObjectId(id);
			Gymnase existingGymnase = gymnaseService.getGymnaseParId(objectId);
			return new ResponseEntity<>(existingGymnase, HttpStatus.OK);
		}
		
		@PostMapping("/add")
		public ResponseEntity<Gymnase> ajoutGymnase(@RequestBody Gymnase gym) {
			Gymnase nouveauGymnase = gymnaseService.addGymnase(gym);
			return new ResponseEntity<>(nouveauGymnase, HttpStatus.CREATED);
		}
		
		@PutMapping("/update")
		public ResponseEntity<Gymnase> modifieGymnase(@RequestBody Gymnase gym) {
			Gymnase updatedGymnase = gymnaseService.updateGymnase(gym);
			return new ResponseEntity<>(updatedGymnase, HttpStatus.OK);
		}
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?> deleteGymnase(@PathVariable("id") String id) {
			ObjectId objectId = new ObjectId(id);
			gymnaseService.effacerGymnase(objectId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
//		@DeleteMapping("/delete")
//		public ResponseEntity<?> deleteGymnase(@RequestBody Gymnase gym) {
//			gymnaseService.deleteGymnase(gym);
//			return new ResponseEntity<>(HttpStatus.OK);
//		}

	}