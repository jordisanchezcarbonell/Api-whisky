package com.example.Api.whisky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/whisky")

public class whiskyController {

    @Autowired
    private whiskyService whiskyService;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/all")//you can give this any name you want and after adding this string to the end of base url you can use this
    public ResponseEntity<List<whisky>> getAllWhiskys() {
        return ResponseEntity.ok(whiskyService.getWhiskyList());
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public ResponseEntity<whisky> getWhiskyById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.whiskyService.getWhiskyById(id));
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addWhisky")
    public ResponseEntity<whisky> addUser(@RequestBody whisky whisky) {
        return ResponseEntity.ok(this.whiskyService.createWhisky(whisky));
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addListWhiskys")
    public ResponseEntity<List<whisky>> addUsers(@RequestBody List<whisky> list) {
        return ResponseEntity.ok(this.whiskyService.createListwhisky(list));
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/updateWhisky/")
    public ResponseEntity<whisky> updateUser(@RequestBody whisky whisky) {
        return ResponseEntity.ok().body(this.whiskyService.updateWhiskyById(whisky));
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/deleteWhisky/{id}")
    public HttpStatus deleteUser(@PathVariable int id) {
        this.whiskyService.deleteWhiskyById(id);
        return HttpStatus.OK;
    }


}
