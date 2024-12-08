package com.klef.sdp.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DonationController {

    @PostMapping("/processDonation")
    public ResponseEntity<DonationResponse> processDonation(@RequestBody DonationRequest donationRequest) {
        // Dummy card validation for this example.
        if (validateCardDetails(donationRequest)) {
            return ResponseEntity.ok(new DonationResponse("Success", "Payment successful"));
        } //else {
            // Return error response if card details are invalid
           // return ResponseEntity.status(400) // 400 Bad Request
             //       .body(new DonationResponse("Error", "Invalid card details or CVC"));
        //}
        return ResponseEntity.ok(new DonationResponse("Success", "Payment successful"));
    }

    private boolean validateCardDetails(DonationRequest donationRequest) {
        // Here you would integrate with a payment gateway like Stripe or PayPal
        // For now, this is just a simple validation for the example
    	DonationRequest3 dr3=new DonationRequest3();
        return "424242424242".equals(dr3.getCardNumber()) && "567".equals(dr3.getCvc());
    }
}