package view;

import controller.impl.*;
import model.entities.*;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
  private static final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
  private final BookingRecordController bookingRecordController;
  private final HotelController hotelController;
  private final HotelFeedbackController hotelFeedbackController;
  private final HotelLocationController hotelLocationController;
  private final HotelRoomController hotelRoomController;
  private final HotelRoomTypeController hotelRoomTypeController;
  private final UserController userController;

  private final Map<String, Printable> menu = new LinkedHashMap<>();

  public View(){
    bookingRecordController = new BookingRecordController();
    hotelController = new HotelController();
    hotelFeedbackController = new HotelFeedbackController();
    hotelLocationController = new HotelLocationController();
    hotelRoomController = new HotelRoomController();
    hotelRoomTypeController = new HotelRoomTypeController();
    userController = new UserController();

    menu.put("11", this::getAllBookingRecords);
    menu.put("12", this::getBookingRecordById);
    menu.put("13", this::createBookingRecord);
    menu.put("14", this::updateBookingRecord);
    menu.put("15", this::deleteBookingRecord);

    menu.put("21", this::getAllHotels);
    menu.put("22", this::getHotelById);
    menu.put("23", this::createHotel);
    menu.put("24", this::updateHotel);
    menu.put("25", this::deleteHotel);

    menu.put("31", this::getAllHotelFeedbacks);
    menu.put("32", this::getHotelFeedbackById);
    menu.put("33", this::createHotelFeedback);
    menu.put("34", this::updateHotelFeedback);
    menu.put("35", this::deleteHotelFeedback);

    menu.put("41", this::getAllHotelLocations);
    menu.put("42", this::getHotelLocationById);
    menu.put("43", this::createHotelLocation);
    menu.put("44", this::updateHotelLocation);
    menu.put("45", this::deleteHotelLocation);

    menu.put("51", this::getAllHotelRooms);
    menu.put("52", this::getHotelRoomById);
    menu.put("53", this::createHotelRoom);
    menu.put("54", this::updateHotelRoom);
    menu.put("55", this::deleteHotelRoom);

    menu.put("61", this::getHotelRoomTypes);
    menu.put("62", this::getHotelRoomTypeById);
    menu.put("63", this::createHotelRoomType);
    menu.put("64", this::updateHotelRoomType);
    menu.put("65", this::deleteHotelRoomType);

    menu.put("71", this::getAllUsers);
    menu.put("72",this::getUserById );
    menu.put("73", this::createUser);
    menu.put("74", this::updateUser);
    menu.put("75", this::deleteUser);

  }
  public void displayMenu() {
    System.out.println("=======================================================================");
    System.out.println("                 Enter XY to choose the option, where:");
    System.out.println("=======================================================================");
    System.out.println("X - entity number:                 |       Y - CRUD number:");
    System.out.println("  1 - booking record               |         1 - GET ALL");
    System.out.println("  2 - hotel                        |         2 - GET ONE");
    System.out.println("  3 - hotel feedback               |         3 - CREATE");
    System.out.println("  4 - hotel location               |         4 - UPDATE");
    System.out.println("  5 - hotel room                   |         5 - DELETE");
    System.out.println("  6 - hotel room type              |                     ");
    System.out.println("  7 - user                         |                     ");

    System.out.println("=======================================================================");
  }
  // --- BOOKING RECORDS ---
  private void getAllBookingRecords(){
    System.out.println("\n[BOOKING RECORD / GET]");
    System.out.println(bookingRecordController.findAll() + "\n");
  }
  private void getBookingRecordById(){
    System.out.println("\n [BOOKING RECORD / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(bookingRecordController.findOne(id) + "\n");
  }
  private BookingRecordEntity getBookingRecordInputs(){
    System.out.println("\n Enter reservation end date ID: ");
    String reservationEndDate = scanner.next();

    System.out.println("Enter reservation start date name : ");
    String reservationStartDate = scanner.next();

    System.out.println("\n Is approved by mail: ");
    Byte isApprovedByMail = scanner.nextByte();

    System.out.println("\n Enter price: ");
    Double price = scanner.nextDouble();

    System.out.println("\n Hotel id: ");
    Integer hotelId = scanner.nextInt();
    HotelEntity hotelEntity = hotelController.findOne(hotelId);

    System.out.println("\n User id: ");
    Integer userId = scanner.nextInt();
    UserEntity userEntity = userController.findOne(userId);

    return new BookingRecordEntity(0, reservationEndDate, reservationStartDate, isApprovedByMail,
                                   price, hotelEntity, userEntity);
  }
  private void createBookingRecord(){
    System.out.println("\n[BOOKING RECORD / CREATE]");
    BookingRecordEntity bookingRecordEntity = getBookingRecordInputs();
    bookingRecordController.create(bookingRecordEntity);
    System.out.println("Booking record successfully created\n");
  }
  private void updateBookingRecord(){
    System.out.println("\n[BOOKING RECORD / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    BookingRecordEntity bookingRecordEntity = getBookingRecordInputs();
    bookingRecordEntity.setId(id);
    bookingRecordController.update(bookingRecordEntity.getId(), bookingRecordEntity);

    System.out.println("Booking record with ID=" + id + " successfully updated");
  }
  private void deleteBookingRecord(){
    System.out.println("[BOOKING RECORD / DELETE] Enter ID: ");
    int id = scanner.nextInt();

    bookingRecordController.delete(id);
    System.out.println("Booking record with ID=" + id + " successfully deleted");
  }

  // --- HOTEL ---
  private void getAllHotels(){
    System.out.println("\n[HOTEL / GET]");
    System.out.println(hotelController.findAll() + "\n");
  }
  private void getHotelById(){
    System.out.println("\n [HOTEL / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(hotelController.findOne(id) + "\n");
  }

  private HotelEntity getHotelInputs(){
    System.out.println("\n Enter hotel name: ");
    String hotelName = scanner.next();

    return new HotelEntity(0, hotelName);
  }
  private void createHotel(){
    System.out.println("\n[HOTEL / CREATE]");
    HotelEntity hotel = getHotelInputs();
    hotelController.create(hotel);
    System.out.println("Hotel successfully created\n");
  }
  private void updateHotel(){
    System.out.println("\n[HOTEL / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    HotelEntity hotel = getHotelInputs();
    hotel.setId(id);
    hotelController.update(hotel.getId(), hotel);

    System.out.println("Hotel with ID=" + id + " successfully updated");
  }
  private void deleteHotel(){
    System.out.println("[HOTEL / DELETE] Enter ID: ");
    int id = scanner.nextInt();
    hotelController.delete(id);
    System.out.println("Hotel with ID=" + id + " successfully deleted");
  }

  // --- HOTEL FEEDBACK ---
  private void getAllHotelFeedbacks(){
    System.out.println("\n[HOTEL FEEDBACK / GET]");
    System.out.println(hotelFeedbackController.findAll() + "\n");
  }
  private void getHotelFeedbackById(){
    System.out.println("\n [HOTEL FEEDBACK / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(hotelFeedbackController.findOne(id) + "\n");
  }
  private HotelFeedbackEntity getHotelFeedbackInputs(){
    System.out.println("\n Enter hotel feedback: ");
    String hotelFeedback = scanner.next();
    System.out.println("\n Enter hotel rating: ");
    Integer hotelRating = scanner.nextInt();

    return new HotelFeedbackEntity(0, hotelFeedback, hotelRating);
  }

  private void createHotelFeedback(){
    System.out.println("\n[HOTEL FEEDBACK / CREATE]");
    HotelFeedbackEntity hotelFeedbackEntity = getHotelFeedbackInputs();
    hotelFeedbackController.create(hotelFeedbackEntity);
    System.out.println("Hotel feedback successfully created\n");
  }
  private void updateHotelFeedback(){
    System.out.println("\n[HOTEL FEEDBACK / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    HotelFeedbackEntity hotelFeedbackEntity = getHotelFeedbackInputs();
    hotelFeedbackEntity.setId(id);
    hotelFeedbackController.update(hotelFeedbackEntity.getId(), hotelFeedbackEntity);

    System.out.println("Hotel feedback with ID=" + id + " successfully updated");
  }
  private void deleteHotelFeedback(){
    System.out.println("[HOTEL FEEDBACK / DELETE] Enter ID: ");
    int id = scanner.nextInt();
    hotelFeedbackController.delete(id);
    System.out.println("Hotel feedback with ID=" + id + " successfully deleted");
  }

  //  --- HOTEL LOCATION ---
  private void getAllHotelLocations(){
    System.out.println("\n[HOTEL LOCATION  / GET]");
    System.out.println(hotelLocationController.findAll() + "\n");
  }
  private void getHotelLocationById(){
    System.out.println("\n [HOTEL LOCATION  / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(hotelLocationController.findOne(id) + "\n");
  }
  private HotelLocationEntity getHotelLocationInputs(){
    System.out.println("\n Enter hotel location country: ");
    String hotelLocationCountry = scanner.next();
    System.out.println("\n Enter hotel location city : ");
    String hotelLocationCity = scanner.next();
    System.out.println("\n Enter hotel location street : ");
    String hotelLocationStreet = scanner.next();

    return new HotelLocationEntity(0, hotelLocationCountry, hotelLocationCity, hotelLocationStreet);
  }
  private void createHotelLocation(){
    System.out.println("\n[HOTEL LOCATION  / CREATE]");
    HotelLocationEntity hotelLocationEntity = getHotelLocationInputs();
    hotelLocationController.create(hotelLocationEntity);
    System.out.println("Hotel location successfully created\n");
  }
  private void updateHotelLocation(){
    System.out.println("\n[HOTEL LOCATION  / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    HotelLocationEntity hotelLocationEntity = getHotelLocationInputs();
    hotelLocationEntity.setId(id);
    hotelLocationController.update(hotelLocationEntity.getId(), hotelLocationEntity);

    System.out.println("Hotel location with ID=" + id + " successfully updated");
  }
  private void deleteHotelLocation(){
    System.out.println("[HOTEL LOCATION / DELETE] Enter ID: ");
    int id = scanner.nextInt();
    hotelLocationController.delete(id);
    System.out.println("Hotel location with ID=" + id + " successfully deleted");
  }

  // --- HOTEL ROOM ---
  private void getAllHotelRooms(){
    System.out.println("\n[HOTEL ROOM / GET]");
    System.out.println(hotelRoomController.findAll() + "\n");
  }
  private void getHotelRoomById(){
    System.out.println("\n [HOTEL ROOM / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(hotelRoomController.findOne(id) + "\n");
  }
  private HotelRoomEntity getHotelRoomInputs(){
    System.out.println("\n Enter hotel room number : ");
    Integer hotelRoomNumbe = scanner.nextInt();
    System.out.println("\n Is booked: ");
    Byte hotelRoomIsBooked = scanner.nextByte();
    System.out.println("\n Enter hotel room price: ");
    Double hotelRoomPrice = scanner.nextDouble();

    System.out.println("\n Hotel room type id: ");
    Integer hotelRoomTypeId = scanner.nextInt();
    HotelRoomTypeEntity hotelRoomTypeEntity = hotelRoomTypeController.findOne(hotelRoomTypeId);

    System.out.println("\n Hotel id: ");
    Integer hotelId = scanner.nextInt();
    HotelEntity hotelEntity = hotelController.findOne(hotelId);
    System.out.println("\n ");

    return new HotelRoomEntity(0, hotelRoomNumbe, hotelRoomIsBooked, hotelRoomPrice, hotelRoomTypeEntity, hotelEntity);
  }
  private void createHotelRoom(){
    System.out.println("\n[HOTEL ROOM / CREATE]");
    HotelRoomEntity hotelRoomEntity = getHotelRoomInputs();
    hotelRoomController.create(hotelRoomEntity);
    System.out.println("Hotel room successfully created\n");
  }
  private void updateHotelRoom(){
    System.out.println("\n[HOTEL ROOM / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    HotelRoomEntity hotelRoomEntity = getHotelRoomInputs();
    hotelRoomEntity.setId(id);
    hotelRoomController.update(hotelRoomEntity.getId(), hotelRoomEntity);

    System.out.println("Hotel room with ID=" + id + " successfully updated");
  }
  private void deleteHotelRoom(){
    System.out.println("[HOTEL ROOM / DELETE] Enter ID: ");
    int id = scanner.nextInt();
    hotelRoomController.delete(id);
    System.out.println("Hotel room with ID=" + id + " successfully deleted");
  }

  // --- HOTEL ROOM TYPE ---
  private void getHotelRoomTypes(){
    System.out.println("\n[HOTEL ROOM TYPE / GET]");
    System.out.println(hotelRoomTypeController.findAll() + "\n");
  }
  private void getHotelRoomTypeById(){
    System.out.println("\n [HOTEL ROOM TYPE / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(hotelRoomTypeController.findOne(id) + "\n");
  }
  private HotelRoomTypeEntity getHotelRoomTypeInputs(){
    System.out.println("\n Enter hotel room type: ");
    String hotelRoomType = scanner.next();

    return new HotelRoomTypeEntity(0, hotelRoomType);
  }
  private void createHotelRoomType(){
    System.out.println("\n[HOTEL ROOM TYPE / CREATE]");
    HotelRoomTypeEntity hotelRoomTypeEntity = getHotelRoomTypeInputs();
    hotelRoomTypeController.create(hotelRoomTypeEntity);
    System.out.println("Hotel room type successfully created\n");
  }
  private void updateHotelRoomType(){
    System.out.println("\n[HOTEL ROOM TYPE / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    HotelRoomTypeEntity hotelRoomTypeEntity = getHotelRoomTypeInputs();
    hotelRoomTypeEntity.setId(id);
    hotelRoomTypeController.update(hotelRoomTypeEntity.getId(), hotelRoomTypeEntity);

    System.out.println("Hotel room type with ID=" + id + " successfully updated");
  }
  private void deleteHotelRoomType(){
    System.out.println("[HOTEL ROOM TYPE / DELETE] Enter ID: ");
    int id = scanner.nextInt();
    hotelRoomTypeController.delete(id);
    System.out.println("Hotel room type with ID=" + id + " successfully deleted");
  }

  // --- USER ---
  private void getAllUsers(){
    System.out.println("\n[USER / GET]");
    System.out.println(userController.findAll() + "\n");
  }
  private void getUserById(){
    System.out.println("\n [USER / GET] Enter ID: ");
    Integer id = scanner.nextInt();
    System.out.println(userController.findOne(id) + "\n");
  }
  private UserEntity getUserInputs(){
    System.out.println("\n Enter user name: ");
    String userName = scanner.next();
    System.out.println("\n Enter user surname: ");
    String userSurname = scanner.next();
    System.out.println("\n Enter user mail: ");
    String userMail = scanner.next();

    return new UserEntity(0, userName, userName, userSurname, userMail);
  }

  private void createUser(){
    System.out.println("\n[USER / CREATE]");
    UserEntity userEntity = getUserInputs();
    userController.create(userEntity);
    System.out.println("User successfully created\n");
  }
  private void updateUser(){
    System.out.println("\n[USER / UPDATE] Enter ID: ");
    Integer id = scanner.nextInt();
    UserEntity userEntity = getUserInputs();
    userEntity.setId(id);
    userController.update(userEntity.getId(), userEntity);

    System.out.println("User with ID=" + id + " successfully updated");
  }
  private void deleteUser(){
    System.out.println("[USER / DELETE] Enter ID: ");
    int id = scanner.nextInt();
    userController.delete(id);
    System.out.println("User with ID=" + id + " successfully deleted");
  }

  public final void show() {
    String input;
    displayMenu();
    System.out.println("\nChoose your fighter:\n");
    do {
      try {
        input = scanner.next();
        menu.get(input).print();
      } catch (Exception ignored) {
      }
    } while (scanner.hasNext());
  }
}