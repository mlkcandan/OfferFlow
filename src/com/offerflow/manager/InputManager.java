package com.offerflow.manager;

import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputManager {

    public static boolean isValidFullName(Component component, String name) {
        if (name == null || name.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Full name cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean isValidEmail(Component component, String email) {
        if (email == null || email.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Email address can't be empty.");
            return false;
        } else if (!email.contains("@") || !email.contains(".")) {
            javax.swing.JOptionPane.showMessageDialog(component, "Invalid email address.");
            return false;
        }
        return true;
    }

    public static boolean isValidPassword(Component component, String password) {
        if (password == null || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Password cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean isValidPhone(Component component, String phone) {
        if (phone == null || phone.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Phone number cannot be empty.");
            return false;
        } else if (phone.length() != 11) {
            javax.swing.JOptionPane.showMessageDialog(component, "Phone number must be 11 digits.");
            return false;
        } else if (phone.matches("\\d")) {
            javax.swing.JOptionPane.showMessageDialog(component, "Phone number should contain only numbers.");
            return false;
        }
        return true;
    }

    public static boolean isValidAddress(Component component, String address) {
        if (address == null || address.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Address cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean isValidBio(Component component, String bio) {
        if (bio == null || bio.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Bio cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean advertControl(Component component, JTextField delTimeField, JTextField priceField, JTextArea descField) {

        String delTime = delTimeField.getText();
        String price = priceField.getText();
        String message = descField.getText();

        for (int i = 0; i < delTime.length(); i++) {
            if (!Character.isDigit(delTime.charAt(i))) {
                javax.swing.JOptionPane.showMessageDialog(component, "Unvalid Delivery Time.");
                return false;
            }
        }

        for (int i = 0; i < price.length(); i++) {
            if (!Character.isDigit(price.charAt(i)) && price.charAt(i) != '.') {
                javax.swing.JOptionPane.showMessageDialog(component, "Unvalid Price.");
                return false;
            }
        }

        if (message.isEmpty() || delTime.isEmpty() || price.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(component, "Please fill in all fields.");
            return false;
        }
        return true;
    }
}
