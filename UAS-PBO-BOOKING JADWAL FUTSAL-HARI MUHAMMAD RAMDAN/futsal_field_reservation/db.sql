-- Create Users Table
CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL
);

-- Create Fields Table
CREATE TABLE fields (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        location VARCHAR(255) NOT NULL,
                        price_per_hour FLOAT NOT NULL
);

-- Create Bookings Table
CREATE TABLE bookings (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          user_id BIGINT NOT NULL,
                          field_id BIGINT NOT NULL,
                          date DATE NOT NULL,
                          start_time TIME NOT NULL,
                          end_time TIME NOT NULL,
                          FOREIGN KEY (user_id) REFERENCES users(id),
                          FOREIGN KEY (field_id) REFERENCES fields(id)
);
