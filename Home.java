package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class Home extends JFrame implements ActionListener {
    
    public Home() {
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1300, 700);
        add(image);
        
        JLabel heading = new JLabel("Welcome to Air India");
        heading.setBounds(500, 40, 1000, 40);
        heading.setForeground(Color.RED);
        heading.setFont(new Font("Arial", Font.ITALIC, 45));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        // Details menu
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        // Ticket menu
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);
        
        // Help menu
        JMenu help = new JMenu("Help");
        menubar.add(help);
        
        JMenuItem feedback = new JMenuItem("Feedback");
        feedback.addActionListener(this);
        help.add(feedback);
        
        // About menu
        JMenu about = new JMenu("About");
        menubar.add(about);
        
        JMenuItem flights = new JMenuItem("Flights: Search and book flights, view flight schedules, and check prices.");
        flights.addActionListener(this);
        about.add(flights);
        
        JMenuItem deals = new JMenuItem("Deals: Find special offers, discounts, or promo codes for flights");
        deals.addActionListener(this);
        about.add(deals);
        
        JMenuItem myTrips = new JMenuItem("My Trips: View, cancel, or modify your existing bookings.");
        myTrips.addActionListener(this);
        about.add(myTrips);
        
        JMenuItem helpSupport = new JMenuItem("Access customer support, FAQs, or contact information.");
        helpSupport.addActionListener(this);
        about.add(helpSupport);
        
        JMenuItem loginRegister = new JMenuItem("Login/Register: Sign in or create an account to manage your bookings and preferences.");
        loginRegister.addActionListener(this);
        about.add(loginRegister);
        
        JMenuItem travelGuides = new JMenuItem("Travel Guides: Explore destination guides, travel tips, and recommendations.");
        travelGuides.addActionListener(this);
        about.add(travelGuides);
        
        // Google Map Menu
        JMenu mapMenu = new JMenu("Map");
        menubar.add(mapMenu);
        
        JMenuItem googleMap = new JMenuItem("Google Map");
        googleMap.addActionListener(e -> openGoogleMap());
        mapMenu.add(googleMap);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        } else if (text.equals("Feedback")) {  
            showFeedbackForm();
        } else {
            JOptionPane.showMessageDialog(null, text); // Display the clicked item text
        }
    }

    // Method to open Google Map
    private void openGoogleMap() {
        try {
            // Open the default web browser to Google Maps URL
            Desktop.getDesktop().browse(new URI("https://maps.google.com"));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to open Google Map.");
        }
    }
    
    // Method to display the feedback form
    private void showFeedbackForm() {
        JDialog feedbackDialog = new JDialog(this, "Feedback Form", true);
        feedbackDialog.setLayout(new GridLayout(10, 1, 10, 10));
        feedbackDialog.setSize(500, 400);
        
        JLabel feedbackLabel = new JLabel("Provide your feedback:");
        JTextField feedbackField = new JTextField();
        
        JLabel optionsLabel = new JLabel("Select feedback categories:");
        JCheckBox pilotBehavior = new JCheckBox("Pilot Behavior");
        JCheckBox crewService = new JCheckBox("Crew Service");
        JCheckBox foodQuality = new JCheckBox("Food Quality");
        JCheckBox flightExperience = new JCheckBox("Flight Experience");
        JCheckBox seatComfort = new JCheckBox("Seat Comfort");
        JCheckBox onTimePerformance = new JCheckBox("On-Time Performance");
        JCheckBox cleanliness = new JCheckBox("Cleanliness");
        JCheckBox overallSatisfaction = new JCheckBox("Overall Satisfaction");
        
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Handle feedback submission
            String feedback = feedbackField.getText();
            boolean pilotChecked = pilotBehavior.isSelected();
            boolean crewChecked = crewService.isSelected();
            boolean foodChecked = foodQuality.isSelected();
            boolean flightChecked = flightExperience.isSelected();
            boolean seatComfortChecked = seatComfort.isSelected();
            boolean onTimeChecked = onTimePerformance.isSelected();
            boolean cleanlinessChecked = cleanliness.isSelected();
            boolean overallChecked = overallSatisfaction.isSelected();
            
            JOptionPane.showMessageDialog(null, 
                "Feedback Submitted:\n" +
                "Feedback: " + feedback + "\n" +
                "Pilot Behavior: " + pilotChecked + "\n" +
                "Crew Service: " + crewChecked + "\n" +
                "Food Quality: " + foodChecked + "\n" +
                "Flight Experience: " + flightChecked + "\n" +
                "Seat Comfort: " + seatComfortChecked + "\n" +
                "On-Time Performance: " + onTimeChecked + "\n" +
                "Cleanliness: " + cleanlinessChecked + "\n" +
                "Overall Satisfaction: " + overallChecked
            );
            feedbackDialog.dispose();
        });
        
        feedbackDialog.add(feedbackLabel);
        feedbackDialog.add(feedbackField);
        feedbackDialog.add(optionsLabel);
        feedbackDialog.add(pilotBehavior);
        feedbackDialog.add(crewService);
        feedbackDialog.add(foodQuality);
        feedbackDialog.add(flightExperience);
        feedbackDialog.add(seatComfort);
        feedbackDialog.add(onTimePerformance);
        feedbackDialog.add(cleanliness);
        feedbackDialog.add(overallSatisfaction);
        feedbackDialog.add(submitButton);
        
        feedbackDialog.setLocationRelativeTo(this);
        feedbackDialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }
}
