package com.ally.unicorns.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.ally.unicorns.dto.UnicornsReq;
import com.ally.unicorns.entity.Unicorns;
import com.ally.unicorns.repository.IMarksRepo;
import com.ally.unicorns.repository.IUnicornsRepo;

@RestController
public class UnicornsController {

	@Autowired
	IUnicornsRepo unicornsRepo;

	@Autowired
	IMarksRepo iMarksRepo;

	@PostMapping("/unicorns")
	public ResponseEntity<Unicorns> save(@RequestBody UnicornsReq request) {

		try {

			return new ResponseEntity<>(unicornsRepo.save(request.getUnicorns()), HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/unicorns")
	public ResponseEntity<List<Unicorns>> getAllUnicorns() {

		try {

			List<Unicorns> list = unicornsRepo.findAll();

			if (list.isEmpty() || list.size() == 0) {
				return new ResponseEntity<List<Unicorns>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Unicorns>>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	@GetMapping("/unicorns/{id}")
	public ResponseEntity<Unicorns> getSingleUnicorn(@PathVariable Long id) {

		Optional<Unicorns> unicorns = unicornsRepo.findById(id);

		if (unicorns.isPresent()) {
			return new ResponseEntity<Unicorns>(unicorns.get(), HttpStatus.OK);
		}

		return new ResponseEntity<Unicorns>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/unicorns/{id}")
	public ResponseEntity<Unicorns> updateUnicorns(@RequestBody UnicornsReq request) {

		try {

			return new ResponseEntity<Unicorns>(unicornsRepo.save(request.getUnicorns()), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Unicorns>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	@DeleteMapping("/unicorns/{id}")
	public ResponseEntity<HttpStatus> deleteUnicorn(@PathVariable Long id) {
		try {
			Optional<Unicorns> unicorn = unicornsRepo.findById(id);
			if (unicorn.isPresent()) {
				unicornsRepo.delete(unicorn.get());
			}
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

/*
 * @PostMapping("/unicorns") public Unicorns placeOrder(@RequestBody UnicornsReq
 * request){ return unicornsRepo.save(request.getUnicorns()); }
 */

/*
 * @GetMapping("/findAllUnicorns") public List<Unicorns> findAllOrders(){ return
 * unicornsRepo.findAll(); }
 */
