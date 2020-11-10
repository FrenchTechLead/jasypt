package com.example;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}

	@PostMapping("/encrypt")
	String encrypt(@RequestBody Model m) {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setPoolSize(4);
		encryptor.setPassword(m.password);
		encryptor.setAlgorithm("PBEWithMD5AndTripleDES");
		String encryptedText = encryptor.encrypt(m.input);
		return encryptedText;
	}
	
	@PostMapping("/decrypt")
	String decrypt(@RequestBody Model m) {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setPoolSize(4);
		encryptor.setPassword(m.password);
		encryptor.setAlgorithm("PBEWithMD5AndTripleDES");
		String decryptedText = encryptor.decrypt(m.input);
		return decryptedText;
	}

}

class Model {
	public String password;
	public String input;
}
