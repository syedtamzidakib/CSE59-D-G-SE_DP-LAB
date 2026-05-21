# PHARMEASY – Online Pharmacy Management System

# Software Requirements Specification (SRS)

---

# Preface

This document provides the Software Requirements Specification (SRS) for **PHARMEASY**, an online pharmacy management system. The document defines the functional and non-functional requirements, system functionalities, user interactions, database requirements, and overall architecture necessary for successful system development and deployment.

PHARMEASY is designed to improve healthcare accessibility by enabling users to purchase medicines online and receive doorstep delivery services. The platform also specializes in helping customers locate and obtain rare or hard-to-find medicines through verified suppliers and pharmacies.

This SRS document serves as a reference for developers, stakeholders, project managers, and testers throughout the software development lifecycle.

---

# Version History

| Version | Description |
|---------|-------------|
| 1.0 | Initial Draft |
| 1.1 | Added Functional and Non-Functional Requirements |
| 1.2 | Added Use Cases and ER Diagram Details |
| 1.3 | Added Rare Medicine Management Features |
| 1.4 | Finalized Complete SRS Documentation |

---

# 1. Introduction

## Purpose

PHARMEASY is a web and mobile-based online pharmacy management system designed to simplify medicine purchasing and healthcare accessibility. The platform enables users to browse medicines, upload prescriptions, place orders, make secure payments, and receive medicines directly at their doorstep.

A major feature of PHARMEASY is its ability to help users search for and obtain rare or hard-to-find medicines that may not be available in local pharmacies. The system connects customers with verified suppliers and pharmacies to improve access to essential healthcare products.

The system also supports inventory management, prescription verification, delivery tracking, reporting, and notification services.

---

## Document Conventions

This document follows IEEE SRS documentation standards.

- **Must** – Indicates mandatory requirements.
- **Should** – Indicates recommended requirements.
- **May** – Indicates optional future enhancements.

---

## Intended Audience and Reading Suggestions

### Developers
To understand the system architecture, modules, and implementation requirements.

### Project Managers
To monitor project scope, features, and development progress.

### Testers and QA Teams
To validate system functionality and requirement compliance.

### Stakeholders
To understand business objectives and operational capabilities.

---

## Scope

PHARMEASY provides the following functionalities:

- Online medicine browsing and purchasing
- Prescription upload and pharmacist verification
- Real-time order and delivery tracking
- Inventory and stock management
- Secure online payment integration
- User authentication and role-based access control
- Notifications and alerts
- Reporting and analytics dashboard
- Rare medicine search and availability management
- Supplier management for rare medicines

The system aims to deliver a secure, reliable, and user-friendly digital pharmacy experience for customers and healthcare providers.

---

## References

- IEEE Standard 830-1998 Software Requirements Specification
- Online Pharmacy System Standards
- Internal Business Requirement Specifications (BRS)

---

# 2. Overall Description

## Product Perspective

PHARMEASY is a standalone cloud-based pharmacy management platform accessible through both web and mobile applications.

The system integrates with:
- Online payment gateways
- SMS and email notification services
- Delivery management systems
- Supplier and pharmacy databases

---

## Product Functions

### Customer Features
- Register and log into the system
- Browse and search medicines
- Search rare medicines
- Upload prescriptions
- Add medicines to cart
- Place orders
- Make secure payments
- Track order and delivery status
- Receive notifications and updates
- Submit medicine reviews and ratings
- Request rare medicines

---

### Pharmacist Features
- Verify uploaded prescriptions
- Approve or reject medicine requests
- Monitor prescription orders

---

### Admin Features
- Manage medicines and categories
- Manage inventory and stock
- Manage users and roles
- Generate reports and analytics
- Monitor deliveries and orders
- Manage suppliers and rare medicine requests
- Manage discounts and promotions

---

### Delivery Personnel Features
- Receive assigned deliveries
- View delivery details
- Update delivery status
- Confirm successful deliveries

---

## User Classes and Characteristics

### Admin
- Full system access
- Responsible for management and monitoring

### Customer
- Purchases medicines and tracks orders

### Pharmacist
- Verifies prescriptions and restricted medicines

### Delivery Personnel
- Handles medicine delivery operations

---

## Operating Environment

### Supported Platforms
- Web Browsers: Chrome, Firefox, Edge, Safari
- Mobile Platforms: Android and iOS

### Hosting Environment
- Cloud-Based Infrastructure

### Technology Stack
- **Frontend:** React.js
- **Backend:** Node.js with Express.js
- **Database:** MongoDB

---

## Design and Implementation Constraints

- The system must comply with healthcare and privacy regulations.
- Prescription medicines require pharmacist approval.
- Online transactions must be securely processed.
- Internet access is required for real-time services.
- Rare medicine procurement depends on supplier availability.

---

## Assumptions and Dependencies

- Users possess internet-enabled devices.
- Payment gateways remain operational.
- Delivery services are available within supported regions.
- Suppliers provide updated rare medicine inventories.
- Future AI-based recommendation systems may be integrated.

---

# 3. System Requirements Specification

# Functional Requirements

---

## 3.1 User Authentication and Authorization

### Functional Requirements

- The system must allow users to register accounts.
- The system must support login using email or phone number.
- The system must provide password reset functionality.
- The system must implement role-based authentication.
- User passwords must be encrypted securely.
- The system must support Customer, Admin, Pharmacist, and Delivery Personnel roles.

---

## 3.2 Medicine Management

### Functional Requirements

- Admins must be able to add, edit, and remove medicines.
- The system must display medicine details including:
  - Medicine Name
  - Price
  - Manufacturer
  - Dosage Information
  - Expiry Date
  - Stock Availability
  - Side Effects
- Medicines must be categorized properly.
- Customers must be able to search medicines efficiently.
- The system must notify admins about low stock availability.

---

## 3.3 Rare Medicine Management

### Functional Requirements

- Customers must be able to search for rare or hard-to-find medicines.
- Customers should be able to submit special rare medicine requests.
- The system should notify customers regarding medicine availability.
- Admins must be able to manage rare medicine suppliers.
- The system must maintain supplier information for rare medicines.
- Customers should receive updates about rare medicine procurement and delivery.

---

## 3.4 Prescription Management

### Functional Requirements

- Customers must be able to upload prescriptions in image or PDF format.
- Prescription medicines must require pharmacist approval before purchase.
- Pharmacists must be able to approve or reject prescriptions.
- Customers must receive prescription status notifications.

---

## 3.5 Cart and Order Management

### Functional Requirements

- Customers must be able to add medicines to the cart.
- Customers must be able to update medicine quantities in the cart.
- The system must automatically calculate total order costs.
- Customers must be able to place orders securely.
- Unique order IDs must be generated automatically.
- Customers must be able to cancel orders before shipment.

---

## 3.6 Payment Management

### Functional Requirements

The system must support:
- Cash on Delivery
- Card Payment
- bKash
- Nagad
- Rocket

Additional Requirements:
- Online transactions must be securely processed.
- Payment confirmation notifications must be sent to customers.

---

## 3.7 Delivery Management

### Functional Requirements

- The system must automatically assign delivery personnel.
- Delivery personnel must receive assigned order information.
- Customers must be able to track delivery status in real time.
- Delivery personnel must update delivery stages:
  - Picked Up
  - Out for Delivery
  - Delivered

---

## 3.8 Notification System

### Functional Requirements

The system must provide:
- Email notifications
- SMS notifications
- In-app notifications

Notifications must be sent for:
- User registration
- Order confirmation
- Payment confirmation
- Prescription approval/rejection
- Delivery updates
- Rare medicine availability updates

---

## 3.9 Reporting and Analytics

### Functional Requirements

Admins must be able to generate:
- Sales reports
- Order reports
- Inventory reports
- Customer activity reports
- Rare medicine demand reports

Additional Requirements:
- Reports should be exportable in PDF and CSV formats.
- The system should provide graphical analytics dashboards.

---

# Non-Functional Requirements

---

## Performance Requirements

- The system must support more than 1000 concurrent users.
- Order and delivery updates must reflect in real time.
- System response time should remain under 3 seconds under normal load.

---

## Security Requirements

- Sensitive user data must be encrypted.
- Secure payment gateways must be implemented.
- The system must provide role-based access control.
- Unauthorized access attempts must be logged and monitored.

---

## Usability Requirements

- The system should provide an intuitive and user-friendly interface.
- Responsive design must be supported for web and mobile platforms.
- Accessibility standards should be maintained.

---

## Reliability and Availability

- The system must ensure 99.9% uptime.
- Backup and recovery mechanisms must be implemented.
- Data consistency must be maintained during transactions.

---

## Maintainability and Support

- The system should support modular development.
- Proper debugging and logging mechanisms must be maintained.
- The platform should support future scalability and updates.

---

## Portability

The system must support:
- Windows
- Linux
- macOS
- Android
- iOS

---

# 4. Use Cases

## Customer Use Cases

- User Registration/Login
- Browse Medicines
- Search Medicines
- Search Rare Medicines
- Upload Prescription
- Add Medicines to Cart
- Place Orders
- Make Payments
- Track Orders
- Request Rare Medicines
- Receive Notifications
- Submit Ratings and Reviews

---

## Admin Use Cases

- Manage Users
- Manage Medicines
- Manage Inventory
- Manage Suppliers
- Monitor Rare Medicine Requests
- Manage Orders and Deliveries
- Generate Reports
- Manage Discounts and Promotions

---

## Pharmacist Use Cases

- Verify Prescriptions
- Approve or Reject Medicine Requests
- Monitor Prescription Orders

---

## Delivery Personnel Use Cases

- View Assigned Deliveries
- Update Delivery Status
- Confirm Delivery Completion

---

# 5. Entity Relationship (ER) Diagram

## Main Entities

- User
- Customer
- Admin
- Pharmacist
- DeliveryPersonnel
- Medicine
- Category
- Supplier
- RareMedicineRequest
- Cart
- CartItem
- Order
- OrderItem
- Prescription
- Payment
- Delivery
- Notification
- Review

---

## Entity Relationships

- A Customer can place multiple Orders.
- An Order contains multiple OrderItems.
- Each OrderItem is associated with one Medicine.
- A Customer can upload multiple Prescriptions.
- A Pharmacist verifies Prescriptions.
- A Customer has one Cart.
- A Cart contains multiple CartItems.
- Medicines belong to Categories.
- Orders are linked with Payments and Deliveries.
- Customers can submit Reviews for Medicines.
- Suppliers provide rare medicines.
- Customers can create multiple RareMedicineRequests.
- RareMedicineRequests are linked with Medicines and Suppliers.

---

# 6. System Evolution

## Assumptions

- AI-based medicine recommendations may be integrated in the future.
- Mobile application functionality may expand further.
- The system may support international medicine suppliers in the future.

---

## Expected Changes

- AI-powered prescription analysis
- Voice-based medicine search
- Advanced delivery tracking
- Integration with healthcare providers and hospitals
- Smart inventory prediction system

---

# 7. Appendices

## Hardware Requirements

- Cloud-based scalable servers
- Secure backup servers
- Load balancing infrastructure

---

## Database Requirements

The database must:
- Maintain logical relationships between entities
- Support high-volume transactions
- Ensure data integrity and consistency
- Provide secure storage for sensitive healthcare information

---

# Conclusion

PHARMEASY is designed to provide a secure, reliable, and efficient online pharmacy management solution that improves healthcare accessibility through digital medicine purchasing and doorstep delivery services. The inclusion of rare medicine management further enhances the platform’s value by helping users access hard-to-find medications through verified suppliers and pharmacies.

The system is built with scalability, maintainability, and security in mind to support future technological advancements and growing user demands.
