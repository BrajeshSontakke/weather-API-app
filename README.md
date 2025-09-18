# Weather API Application

This is a simple Spring Boot application that provides weather information based on a city name input by the user. The application uses Thymeleaf for the front-end interface and calls a weather API to retrieve the weather data.

## Project Structure

```
weather-api-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── weather
│   │   │               ├── WeatherApiApplication.java
│   │   │               ├── controller
│   │   │               │   └── WeatherController.java
│   │   │               ├── service
│   │   │               │   └── WeatherService.java
│   │   │               └── model
│   │   │                   └── WeatherResponse.java
│   │   └── resources
│   │       ├── templates
│   │       │   └── index.html
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Setup

1. Clone the repository or download the project files.
2. Navigate to the project directory.
3. Open a terminal and run the following command to build the project:

   ```
   mvn clean install
   ```

## Running the Application

To run the application, use the following command:

```
mvn spring-boot:run
```

The application will start on `localhost:8080`.

## Accessing the Application

Open your web browser and go to:

```
http://localhost:8080
```

You will see a simple user interface where you can enter a city name and click the button to get the weather information.

## API Key Configuration

If your weather API requires an API key, make sure to add it to the `application.properties` file in the following format:

```
weather.api.key=YOUR_API_KEY
```

## License

This project is licensed under the MIT License.