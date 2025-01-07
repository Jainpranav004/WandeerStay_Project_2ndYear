# WandeerStay_Project_2ndYear
Overview
This project is a web application named WanderStay, designed to list various properties. Users can browse through the listings, edit them, delete them, and provide feedback or reviews. It is built using HTML, CSS, JavaScript, and a backend powered by Java (JSP, Servlets, DAO Classes) along with JSTL for dynamic content rendering.

Features
Homepage:
        Displays a collection of property listings.
        Each listing includes an image, title, description, price, and location.
        CRUD Operations:
Create: Add new property listings.
Edit:   Update existing listings.
Delete: Remove listings.
Feedback & Reviews:
        Users can submit feedback and leave reviews for properties.
        Average review score displayed for each listing.
Search & Filters:
        Search for properties by name or location.
        Filter listings based on price, rating, or category.
Authentication:
        User login and registration functionality.
        Only authenticated users can add/edit/delete listings or leave feedback.
Dynamic Pages:
        Fully dynamic pages generated using JSP and JSTL.
        Backend integration ensures data is retrieved and displayed seamlessly.
Technologies Used
Frontend
HTML:    Structure of the web pages.
CSS:     Styling of components for a responsive and user-friendly UI.
JavaScript: 
          Dynamic interactions, form validation, and client-side logic.
Backend
Java (JSP, Servlets): 
        Handles requests, responses, and dynamic content generation.
        DAO Classes: Encapsulate database access and logic for better abstraction and reusability.
        JSTL (JavaServer Pages Tag Library): Simplifies JSP scripting by providing ready-to-use tags.
Database
MySQL:   Stores user data, property listings, feedback, and reviews.

Prerequisites : 
  Java JDK 8 or above
  Apache Tomcat Server (version 9+ recommended)
  MySQL Database
  Maven (for dependency management)



Functional Details
Home Page
        Displays a list of available properties.
        Provides options to edit, delete, or review properties.
Property Management
Add New Property:  Users can fill out a form to add new listings.
Edit Property:     Update property details such as price or description.
Delete Property:   Remove a listing permanently.

Feedback & Reviews
                  Users can provide feedback for each listing.
                  Display average ratings and feedback comments for each property.
User Authentication
        Registration: New users can register with a username and password.
        Login: Existing users can log in to access restricted features.
        
Future Enhancements
  Add a booking system to allow users to reserve properties.
  Include advanced filters like amenities, pet-friendly properties, etc.
  Implement image uploads for property listings.
  Integrate payment gateway for booking payments.
  Enhance UI with a modern framework like React or Angular.
  



  
