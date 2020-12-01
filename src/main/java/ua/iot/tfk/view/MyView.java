package ua.iot.tfk.view;

import ua.iot.tfk.controller.*;
import ua.iot.tfk.model.entity.*;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class MyView {
    private static final Scanner INPUT = new Scanner(System.in);
    private final BusController busController = new BusController();
    private final CityController cityController = new CityController();
    private final CruiseController cruiseController = new CruiseController();
    private final GuideController guideController = new GuideController();
    private final HotelController hotelController = new HotelController();
    private final LandController landController = new LandController();
    private final PedestrianController pedestrianController = new PedestrianController();
    private final StartNextArrivalController startNextArrivalController = new StartNextArrivalController();
    private final StoppingPointController stoppingPointController = new StoppingPointController();
    private final TourController tourController = new TourController();
    private final TouristController touristController = new TouristController();
    private final TouristDestinationController touristDestinationController = new TouristDestinationController();
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;

    public MyView() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();

        menu.put("Q", "Q - exit program");
        menu.put("S", "S - show menu");


        menu.put("1", "\n1 - Get all buses");
        menu.put("2", "2 - Get bus by ID");
        menu.put("3", "3 - Create bus");
        menu.put("4", "4 - Delete bus");
        menu.put("5", "5 - Update bus \n");

        menu.put("6", "6 - Get all cities");
        menu.put("7", "7 - Get city by ID");
        menu.put("8", "8 - Create city");
        menu.put("9", "9 - Delete city");
        menu.put("10", "10 - Update city \n");

        menu.put("11", "11 - Get all cruises");
        menu.put("12", "12 - Get cruise by ID");
        menu.put("13", "13 - Create cruise");
        menu.put("14", "14 - Delete cruise");
        menu.put("15", "15 - Update cruise \n");

        menu.put("16", "16 - Get all guides");
        menu.put("17", "17 - Get guide by ID");
        menu.put("18", "18 - Create guide");
        menu.put("19", "19 - Delete guide");
        menu.put("20", "20 - Update guide \n");

        menu.put("21", "21 - Get all hotels");
        menu.put("22", "22 - Get hotel by ID");
        menu.put("23", "23 - Create hotel");
        menu.put("24", "24 - Delete hotel");
        menu.put("25", "25 - Update hotel \n");

        menu.put("26", "26 - Get all lands");
        menu.put("27", "27 - Get land by ID");
        menu.put("28", "28 - Create land");
        menu.put("29", "29 - Delete land");
        menu.put("30", "30 - Update land \n");

        menu.put("31", "31 - Get all pedestrians");
        menu.put("32", "32 - Get pedestrian by ID");
        menu.put("33", "33 - Create pedestrian");
        menu.put("34", "34 - Delete pedestrian");
        menu.put("35", "35 - Update pedestrian \n");

        menu.put("36", "36 - Get all start next arrivals");
        menu.put("37", "37 - Get start next arrival by ID");
        menu.put("38", "38 - Create start next arrival");
        menu.put("39", "39 - Delete start next arrival");
        menu.put("40", "40 - Update start next arrival \n");

        menu.put("41", "41 - Get all stopping points");
        menu.put("42", "42 - Get stopping point by ID");
        menu.put("43", "43 - Create stopping point");
        menu.put("44", "44 - Delete stopping point");
        menu.put("45", "45 - Update stopping point \n");

        menu.put("46", "46 - Get all tours");
        menu.put("47", "47 - Get tour by ID");
        menu.put("48", "48 - Create tour");
        menu.put("49", "49 - Delete tour");
        menu.put("50", "50 - Update tour \n");

        menu.put("51", "51 - Get all tourists");
        menu.put("52", "52 - Get tourist by ID");
        menu.put("53", "53 - Create tourist");
        menu.put("54", "54 - Delete tourist");
        menu.put("55", "55 - Update tourist \n");

        menu.put("56", "56 - Get all tourist destinations");
        menu.put("57", "57 - Get tourist destination by ID");
        menu.put("58", "58 - Create tourist destination");
        menu.put("59", "59 - Delete tourist destination");
        menu.put("60", "60 - Update tourist destination \n");

        methodsMenu.put("S", this::showMenu);

        methodsMenu.put("1", this::getAllBuses);
        methodsMenu.put("2", this::getBusById);
        methodsMenu.put("3", this::createBus);
        methodsMenu.put("4", this::deleteBus);
        methodsMenu.put("5", this::updateBus);

        methodsMenu.put("6", this::getAllCities);
        methodsMenu.put("7", this::getCityById);
        methodsMenu.put("8", this::createCity);
        methodsMenu.put("9", this::deleteCity);
        methodsMenu.put("10", this::updateCity);

        methodsMenu.put("11", this::getAllCruises);
        methodsMenu.put("12", this::getCruiseById);
        methodsMenu.put("13", this::createCruise);
        methodsMenu.put("14", this::deleteCruise);
        methodsMenu.put("15", this::updateCruise);

        methodsMenu.put("16", this::getAllGuides);
        methodsMenu.put("17", this::getGuideById);
        methodsMenu.put("18", this::createGuide);
        methodsMenu.put("19", this::deleteGuide);
        methodsMenu.put("20", this::updateGuide);

        methodsMenu.put("21", this::getAllHotels);
        methodsMenu.put("22", this::getHotelById);
        methodsMenu.put("23", this::createHotel);
        methodsMenu.put("24", this::deleteHotel);
        methodsMenu.put("25", this::updateHotel);

        methodsMenu.put("26", this::getAllLands);
        methodsMenu.put("27", this::getLandById);
        methodsMenu.put("28", this::createLand);
        methodsMenu.put("29", this::deleteLand);
        methodsMenu.put("30", this::updateLand);

        methodsMenu.put("31", this::getAllPedestrians);
        methodsMenu.put("32", this::getPedestrianById);
        methodsMenu.put("33", this::createPedestrian);
        methodsMenu.put("34", this::deletePedestrian);
        methodsMenu.put("35", this::updatePedestrian);

        methodsMenu.put("36", this::getAllStartNextArrivals);
        methodsMenu.put("37", this::getStartNextArrivalById);
        methodsMenu.put("38", this::createStartNextArrival);
        methodsMenu.put("39", this::deleteStartNextArrival);
        methodsMenu.put("40", this::updateStartNextArrival);

        methodsMenu.put("41", this::getAllStoppingPoints);
        methodsMenu.put("42", this::getStoppingPointById);
        methodsMenu.put("43", this::createStoppingPoint);
        methodsMenu.put("44", this::deleteStoppingPoint);
        methodsMenu.put("45", this::updateStoppingPoint);

        methodsMenu.put("46", this::getAllTours);
        methodsMenu.put("47", this::getTourById);
        methodsMenu.put("48", this::createTour);
        methodsMenu.put("49", this::deleteTour);
        methodsMenu.put("50", this::updateTour);

        methodsMenu.put("51", this::getAllTourists);
        methodsMenu.put("52", this::getTouristById);
        methodsMenu.put("53", this::createTourist);
        methodsMenu.put("54", this::deleteTourist);
        methodsMenu.put("55", this::updateTourist);

        methodsMenu.put("56", this::getAllTouristDestinations);
        methodsMenu.put("57", this::getTouristDestinationById);
        methodsMenu.put("58", this::createTouristDestination);
        methodsMenu.put("59", this::deleteTouristDestination);
        methodsMenu.put("60", this::updateTouristDestination);
    }


    private void getAllBuses() throws SQLException {
        System.out.println("\nBuses:\n");
        System.out.println(busController.getAll());
    }

    private void getBusById() throws SQLException {
        System.out.println("\nEnter ID for bus\n");
        int id = INPUT.nextInt();
        System.out.println(busController.getBy(id));
    }

    private void deleteBus() throws SQLException {
        System.out.println("\nEnter ID for an bus you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(busController.delete(id));
    }

    private void createBus() throws SQLException {
        System.out.println("\nEnter busName");
        String busName = INPUT.next();
        Bus bus = new Bus(busName);
        System.out.println(busController.create(bus));
    }

    private void updateBus() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter busName");
        String busName = INPUT.next();
        Bus updatedBus = new Bus(busName);
        System.out.println(busController.update(updatedBus));
    }


    private void getAllCities() throws SQLException {
        System.out.println("\nCities:\n");
        System.out.println(cityController.getAll());
    }

    private void getCityById() throws SQLException {
        System.out.println("\nEnter ID for city\n");
        int id = INPUT.nextInt();
        System.out.println(cityController.getBy(id));
    }

    private void deleteCity() throws SQLException {
        System.out.println("\nEnter ID for an city you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(cityController.delete(id));
    }

    private void createCity() throws SQLException {
        System.out.println("\nEnter cityName");
        String cityName = INPUT.next();
        System.out.println("\nEnter landName");
        String landName = INPUT.next();
        City city = new City(cityName, landName);
        System.out.println(cityController.create(city));
    }

    private void updateCity() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter cityName");
        String cityName = INPUT.next();
        System.out.println("\nEnter landName");
        String landName = INPUT.next();
        City updatedCity = new City(cityName, landName);
        System.out.println(cityController.update(updatedCity));
    }


    private void getAllCruises() throws SQLException {
        System.out.println("\nCruises:\n");
        System.out.println(cruiseController.getAll());
    }

    private void getCruiseById() throws SQLException {
        System.out.println("\nEnter ID for cruise\n");
        int id = INPUT.nextInt();
        System.out.println(cruiseController.getBy(id));
    }

    private void deleteCruise() throws SQLException {
        System.out.println("\nEnter ID for an cruise you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(cruiseController.delete(id));
    }

    private void createCruise() throws SQLException {
        System.out.println("\nEnter cruiseLinerName");
        String cruiseLinerName = INPUT.next();
        Cruise cruise = new Cruise(cruiseLinerName);
        System.out.println(cruiseController.create(cruise));
    }

    private void updateCruise() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter cruiseLinerName");
        String cruiseLinerName = INPUT.next();
        Cruise updatedCruise = new Cruise(cruiseLinerName);
        System.out.println(cruiseController.update(updatedCruise));
    }


    private void getAllGuides() throws SQLException {
        System.out.println("\nGuides:\n");
        System.out.println(guideController.getAll());
    }

    private void getGuideById() throws SQLException {
        System.out.println("\nEnter ID for guide\n");
        int id = INPUT.nextInt();
        System.out.println(guideController.getBy(id));
    }

    private void deleteGuide() throws SQLException {
        System.out.println("\nEnter ID for an guide you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(guideController.delete(id));
    }

    private void createGuide() throws SQLException {
        System.out.println("\nEnter guideName");
        String guideName = INPUT.next();
        System.out.println("\nEnter guideDateWork");
        String guideDateWork = INPUT.next();
        System.out.println("\nEnter guideNumPhone");
        String guideNumPhone = INPUT.next();
        Guide guide = new Guide(guideName, guideDateWork, guideNumPhone);
        System.out.println(guideController.create(guide));
    }

    private void updateGuide() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter guideName");
        String guideName = INPUT.next();
        System.out.println("\nEnter guideDateWork");
        String guideDateWork = INPUT.next();
        System.out.println("\nEnter guideNumPhone");
        String guideNumPhone = INPUT.next();
        Guide updatedGuide = new Guide(guideName, guideDateWork, guideNumPhone);
        System.out.println(guideController.update(updatedGuide));
    }


    private void getAllHotels() throws SQLException {
        System.out.println("\nHotels:\n");
        System.out.println(hotelController.getAll());
    }

    private void getHotelById() throws SQLException {
        System.out.println("\nEnter ID for hotel\n");
        int id = INPUT.nextInt();
        System.out.println(hotelController.getBy(id));
    }

    private void deleteHotel() throws SQLException {
        System.out.println("\nEnter ID for an hotel you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(hotelController.delete(id));
    }

    private void createHotel() throws SQLException {
        System.out.println("\nEnter hotelName");
        String hotelName = INPUT.next();
        System.out.println("\nEnter payOnDay");
        Integer payOnDay = INPUT.nextInt();
        System.out.println("\nEnter hotelClass");
        Integer hotelClass = INPUT.nextInt();
        System.out.println("\nEnter idCity");
        Integer idCity = INPUT.nextInt();
        Hotel hotel = new Hotel(hotelName, payOnDay, hotelClass, idCity);
        System.out.println(hotelController.create(hotel));
    }

    private void updateHotel() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter hotelName");
        String hotelName = INPUT.next();
        System.out.println("\nEnter payOnDay");
        Integer payOnDay = INPUT.nextInt();
        System.out.println("\nEnter hotelClass");
        Integer hotelClass = INPUT.nextInt();
        System.out.println("\nEnter idCity");
        Integer idCity = INPUT.nextInt();
        Hotel updatedHotel = new Hotel(hotelName, payOnDay, hotelClass, idCity);
        System.out.println(hotelController.update(updatedHotel));
    }


    private void getAllLands() throws SQLException {
        System.out.println("\nLands:\n");
        System.out.println(landController.getAll());
    }

    private void getLandById() throws SQLException {
        System.out.println("\nEnter ID for land\n");
        int id = INPUT.nextInt();
        System.out.println(landController.getBy(id));
    }

    private void deleteLand() throws SQLException {
        System.out.println("\nEnter ID for an land you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(landController.delete(id));
    }

    private void createLand() throws SQLException {
        System.out.println("\nEnter landName");
        String landName = INPUT.next();
        Land land = new Land(landName);
        System.out.println(landController.create(land));
    }

    private void updateLand() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter landName");
        String landName = INPUT.next();
        Land updatedLand = new Land(landName);
        System.out.println(landController.update(updatedLand));
    }


    private void getAllPedestrians() throws SQLException {
        System.out.println("\nPedestrians:\n");
        System.out.println(pedestrianController.getAll());
    }

    private void getPedestrianById() throws SQLException {
        System.out.println("\nEnter ID for pedestrian\n");
        int id = INPUT.nextInt();
        System.out.println(pedestrianController.getBy(id));
    }

    private void deletePedestrian() throws SQLException {
        System.out.println("\nEnter ID for an pedestrian you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(pedestrianController.delete(id));
    }

    private void createPedestrian() throws SQLException {
        System.out.println("\nEnter distanceKM");
        Integer distanceKM = INPUT.nextInt();
        Pedestrian pedestrian = new Pedestrian(distanceKM);
        System.out.println(pedestrianController.create(pedestrian));
    }

    private void updatePedestrian() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter distanceKM");
        Integer distanceKM = INPUT.nextInt();
        Pedestrian updatedPedestrian = new Pedestrian(distanceKM);
        System.out.println(pedestrianController.update(updatedPedestrian));
    }


    private void getAllStartNextArrivals() throws SQLException {
        System.out.println("\nStart Next Arrivals:\n");
        System.out.println(startNextArrivalController.getAll());
    }

    private void getStartNextArrivalById() throws SQLException {
        System.out.println("\nEnter ID for start next arrival\n");
        int id = INPUT.nextInt();
        System.out.println(startNextArrivalController.getBy(id));
    }

    private void deleteStartNextArrival() throws SQLException {
        System.out.println("\nEnter ID for an start next arrival you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(startNextArrivalController.delete(id));
    }

    private void createStartNextArrival() throws SQLException {
        System.out.println("\nEnter startNextArrivalDate");
        String startNextArrivalDate = INPUT.next();
        System.out.println("\nEnter idTour");
        Integer idTour = INPUT.nextInt();
        StartNextArrival startNextArrival = new StartNextArrival(startNextArrivalDate, idTour);
        System.out.println(startNextArrivalController.create(startNextArrival));
    }

    private void updateStartNextArrival() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter startNextArrivalDate");
        String startNextArrivalDate = INPUT.next();
        System.out.println("\nEnter idTour");
        Integer idTour = INPUT.nextInt();
        StartNextArrival updatedStartNextArrival = new StartNextArrival(startNextArrivalDate, idTour);
        System.out.println(startNextArrivalController.update(updatedStartNextArrival));
    }


    private void getAllStoppingPoints() throws SQLException {
        System.out.println("\nStopping Points:\n");
        System.out.println(stoppingPointController.getAll());
    }

    private void getStoppingPointById() throws SQLException {
        System.out.println("\nEnter ID for stopping point\n");
        int id = INPUT.nextInt();
        System.out.println(stoppingPointController.getBy(id));
    }

    private void deleteStoppingPoint() throws SQLException {
        System.out.println("\nEnter ID for an stopping point you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(stoppingPointController.delete(id));
    }

    private void createStoppingPoint() throws SQLException {
        System.out.println("\nEnter stoppingPointLocation");
        String stoppingPointLocation = INPUT.next();
        StoppingPoint stoppingPoint = new StoppingPoint(stoppingPointLocation);
        System.out.println(stoppingPointController.create(stoppingPoint));
    }

    private void updateStoppingPoint() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter stoppingPointLocation");
        String stoppingPointLocation = INPUT.next();
        StoppingPoint updatedStoppingPoint = new StoppingPoint(stoppingPointLocation);
        System.out.println(stoppingPointController.update(updatedStoppingPoint));
    }


    private void getAllTours() throws SQLException {
        System.out.println("\nTours:\n");
        System.out.println(tourController.getAll());
    }

    private void getTourById() throws SQLException {
        System.out.println("\nEnter ID for tour\n");
        int id = INPUT.nextInt();
        System.out.println(tourController.getBy(id));
    }

    private void deleteTour() throws SQLException {
        System.out.println("\nEnter ID for an tour you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(tourController.delete(id));
    }

    private void createTour() throws SQLException {
        System.out.println("\nEnter tourName");
        String tourName = INPUT.next();
        System.out.println("\nEnter description");
        String description = INPUT.next();
        System.out.println("\nEnter duration");
        Integer duration = INPUT.nextInt();
        System.out.println("\nEnter priceOnePerson");
        Integer priceOnePerson = INPUT.nextInt();
        System.out.println("\nEnter idPedestrian");
        Integer idPedestrian = INPUT.nextInt();
        System.out.println("\nEnter idBus");
        Integer idBus = INPUT.nextInt();
        System.out.println("\nEnter idCruise");
        Integer idCruise = INPUT.nextInt();
        Tour tour = new Tour(tourName, description, duration, priceOnePerson, idPedestrian, idBus, idCruise);
        System.out.println(tourController.create(tour));
    }

    private void updateTour() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter tourName");
        String tourName = INPUT.next();
        System.out.println("\nEnter description");
        String description = INPUT.next();
        System.out.println("\nEnter duration");
        Integer duration = INPUT.nextInt();
        System.out.println("\nEnter priceOnePerson");
        Integer priceOnePerson = INPUT.nextInt();
        System.out.println("\nEnter idPedestrian");
        Integer idPedestrian = INPUT.nextInt();
        System.out.println("\nEnter idBus");
        Integer idBus = INPUT.nextInt();
        System.out.println("\nEnter idCruise");
        Integer idCruise = INPUT.nextInt();
        Tour updatedTour = new Tour(tourName, description, duration, priceOnePerson, idPedestrian, idBus, idCruise);
        System.out.println(tourController.update(updatedTour));
    }


    private void getAllTourists() throws SQLException {
        System.out.println("\nTourists:\n");
        System.out.println(touristController.getAll());
    }

    private void getTouristById() throws SQLException {
        System.out.println("\nEnter ID for tourist\n");
        int id = INPUT.nextInt();
        System.out.println(touristController.getBy(id));
    }

    private void deleteTourist() throws SQLException {
        System.out.println("\nEnter ID for an tourist you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(touristController.delete(id));
    }

    private void createTourist() throws SQLException {
        System.out.println("\nEnter touristName");
        String touristName = INPUT.next();
        System.out.println("\nEnter touristAge");
        Integer touristAge = INPUT.nextInt();
        System.out.println("\nEnter touristNumPhone");
        String touristNumPhone = INPUT.next();
        Tourist tourist = new Tourist(touristName, touristAge, touristNumPhone);
        System.out.println(touristController.create(tourist));
    }

    private void updateTourist() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter touristName");
        String touristName = INPUT.next();
        System.out.println("\nEnter touristAge");
        Integer touristAge = INPUT.nextInt();
        System.out.println("\nEnter touristNumPhone");
        String touristNumPhone = INPUT.next();
        Tourist updatedTourist = new Tourist(touristName, touristAge, touristNumPhone);
        System.out.println(touristController.update(updatedTourist));
    }


    private void getAllTouristDestinations() throws SQLException {
        System.out.println("\nTourist Destinations:\n");
        System.out.println(touristDestinationController.getAll());
    }

    private void getTouristDestinationById() throws SQLException {
        System.out.println("\nEnter ID for tourist destination\n");
        int id = INPUT.nextInt();
        System.out.println(touristDestinationController.getBy(id));
    }

    private void deleteTouristDestination() throws SQLException {
        System.out.println("\nEnter ID for an tourist destination you want to delete\n");
        int id = INPUT.nextInt();
        System.out.println(touristDestinationController.delete(id));
    }

    private void createTouristDestination() throws SQLException {
        System.out.println("\nEnter travelDate");
        String travelDate = INPUT.next();
        System.out.println("\nEnter idTourist");
        Integer idTourist = INPUT.nextInt();
        System.out.println("\nEnter idHotel");
        Integer idHotel = INPUT.nextInt();
        System.out.println("\nEnter idTour");
        Integer idTour = INPUT.nextInt();
        TouristDestination touristDestination = new TouristDestination(travelDate, idTourist, idHotel, idTour);
        System.out.println(touristDestinationController.create(touristDestination));
    }

    private void updateTouristDestination() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter travelDate");
        String travelDate = INPUT.next();
        System.out.println("\nEnter idTourist");
        Integer idTourist = INPUT.nextInt();
        System.out.println("\nEnter idHotel");
        Integer idHotel = INPUT.nextInt();
        System.out.println("\nEnter idTour");
        Integer idTour = INPUT.nextInt();
        TouristDestination updatedTouristDestination = new TouristDestination(travelDate, idTourist, idHotel, idTour);
        System.out.println(touristDestinationController.update(updatedTouristDestination));
    }


    private void showMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    private void showMainMenu() {
        System.out.println(menu.get("S"));
        System.out.println(menu.get("Q"));
        System.out.println("Select menu option.");
    }

    public void show() {
        String keyMenu;
        showMainMenu();
        do {
            keyMenu = INPUT.next().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception ignored) {
            }

        } while (!keyMenu.equals("Q"));
    }
}
