package passive.view;

import passive.controller.Controller;
import passive.controller.impl.*;
import passive.model.entities.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
  private static final String KEY_EXIT = "Q";

  private static final String ERROR_NO_SUCH_OPTION = "No such option found. Try again.";

  private static final String TEXT_SELECT_MENU_OPTION = "Please choose menu option: ";
  private static final String TEXT_GO_BACK = "Go back or quit";

  private static Scanner input = new Scanner(System.in, "UTF-8");

  public View() {
  }

  public void show() {
    showTablesMenu();
  }

  private void showTablesMenu() {
    Map<String, String> tablesMenu = generateTablesMenu();
    Map<String, Printable> tablesMenuMethods = generateTablesMenuMethods();
    showMenuFromMaps(tablesMenu, tablesMenuMethods);
  }

  private Map<String, String> generateTablesMenu() {
    Map<String, String> tablesMenu = new LinkedHashMap<String, String>();
    tablesMenu.put("1", "Table: Booking Record");
    tablesMenu.put("2", "Table: Hotel");
    tablesMenu.put("3", "Table: Hotel Feedback");
    tablesMenu.put("4", "Table: Hotel Location");
    tablesMenu.put("5", "Table: Hotel Room");
    tablesMenu.put("6", "Table: Hotel Room Type");
    tablesMenu.put("7", "Table: User");
    return tablesMenu;
  }

  private Map<String, Printable> generateTablesMenuMethods() {
    Map<String, Printable> tableMenuMethods = new LinkedHashMap<String, Printable>();
    tableMenuMethods.put("1", this::showBookingRecordMenu);
    tableMenuMethods.put("2", this::showHotelMenu);
    tableMenuMethods.put("3", this::showHotelFeedbackMenu);
    tableMenuMethods.put("4", this::showHotelLocationMenu);
    tableMenuMethods.put("5", this::showHotelRoomMenu);
    tableMenuMethods.put("6", this::showHotelRoomTypeMenu);
    tableMenuMethods.put("7", this::showUserMenu);

    return tableMenuMethods;
  }

  private void showBookingRecordMenu() {
    Map<String, String> menu = generateBookingRecordMenu();
    Map<String, Printable> menuMethods = generateBookingRecordMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private void showHotelMenu() {
    Map<String, String> menu = generateHotelMenu();
    Map<String, Printable> menuMethods = generateHotelMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private void showHotelFeedbackMenu() {
    Map<String, String> menu = generateHotelFeedbackMenu();
    Map<String, Printable> menuMethods = generateHotelFeedbackMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private void showHotelLocationMenu() {
    Map<String, String> menu = generateHotelLocationMenu();
    Map<String, Printable> menuMethods = generateHotelLocationMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private void showHotelRoomMenu() {
    Map<String, String> menu = generateHotelRoomMenu();
    Map<String, Printable> menuMethods = generateHotelRoomMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private void showHotelRoomTypeMenu() {
    Map<String, String> menu = generateHotelRoomTypeMenu();
    Map<String, Printable> menuMethods = generateHotelRoomTypeMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private void showUserMenu() {
    Map<String, String> menu = generateUserMenu();
    Map<String, Printable> menuMethods = generateUserMenuMethods();
    showMenuFromMaps(menu, menuMethods);
  }

  private Map<String, String> generateBookingRecordMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select all booking records");
    menu.put("2", "Select booking record");
    menu.put("3", "Create booking record");
    menu.put("4", "Update booking record");
    menu.put("5", "Delete booking record");
    return menu;
  }

  private Map<String, String> generateHotelMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select all hotels");
    menu.put("2", "Select hotel");
    menu.put("3", "Create hotel");
    menu.put("4", "Update hotel");
    menu.put("5", "Delete hotel");
    return menu;
  }

  private Map<String, String> generateHotelFeedbackMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select all hotel's feedbacks");
    menu.put("2", "Select hotel's feedback");
    menu.put("3", "Create hotel's feedback");
    menu.put("4", "Update hotel's feedback");
    menu.put("5", "Delete hotel's feedback");
    return menu;
  }

  private Map<String, String> generateHotelLocationMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select hotel's locations");
    menu.put("2", "Select hotel's location");
    menu.put("3", "Create hotel's location");
    menu.put("4", "Update hotel's location");
    menu.put("5", "Delete hotel's location");
    return menu;
  }

  private Map<String, String> generateHotelRoomMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select all hotel rooms");
    menu.put("2", "Select hotel room");
    menu.put("3", "Create hotel room");
    menu.put("4", "Update hotel room");
    menu.put("5", "Delete hotel room");
    return menu;
  }

  private Map<String, String> generateHotelRoomTypeMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select all hotel room types");
    menu.put("2", "Select hotel room type");
    menu.put("3", "Create hotel room type");
    menu.put("4", "Update hotel room type");
    menu.put("5", "Delete hotel room type");
    return menu;
  }

  private Map<String, String> generateUserMenu() {
    Map<String, String> menu = new LinkedHashMap<String, String>();
    menu.put("1", "Select all users");
    menu.put("2", "Select user");
    menu.put("3", "Create user");
    menu.put("4", "Update user");
    menu.put("5", "Delete user");
    return menu;
  }

  private Map<String, Printable> generateBookingRecordMenuMethods() {
    Controller<BookingRecordEntity, Integer> bookingRecordController = new BookingRecordControllerImpl();
    Formatter<BookingRecordEntity, Integer> formatter = new Formatter<>(BookingRecordEntity.class);
    ViewOperations<BookingRecordEntity, Integer> bookingRecordOperation = new ViewOperations<>(bookingRecordController, formatter,
        BookingRecordEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", bookingRecordOperation::findAll);
    menuMethods.put("2", bookingRecordOperation::findById);
    menuMethods.put("3", bookingRecordOperation::create);
    menuMethods.put("4", bookingRecordOperation::update);
    menuMethods.put("5", bookingRecordOperation::delete);
    return menuMethods;
  }



  private Map<String, Printable> generateHotelMenuMethods() {
    Controller<HotelEntity, Integer> hotelController = new HotelControllerImpl();
    Formatter<HotelEntity, Integer> formatter = new Formatter<>(HotelEntity.class);
    ViewOperations<HotelEntity, Integer> hotelOperation = new ViewOperations<>(hotelController,
        formatter, HotelEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", hotelOperation::findAll);
    menuMethods.put("2", hotelOperation::findById);
    menuMethods.put("3", hotelOperation::create);
    menuMethods.put("4", hotelOperation::update);
    menuMethods.put("5", hotelOperation::delete);
    return menuMethods;
  }


  private Map<String, Printable> generateHotelFeedbackMenuMethods() {
    Controller<HotelFeedbackEntity, Integer> hotelFeedbackController = new HotelFeedbackControllerImpl();
    Formatter<HotelFeedbackEntity, Integer> formatter = new Formatter<>(HotelFeedbackEntity.class);
    ViewOperations<HotelFeedbackEntity, Integer> hotelFeedbackOperation = new ViewOperations<>(hotelFeedbackController, formatter,
        HotelFeedbackEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", hotelFeedbackOperation::findAll);
    menuMethods.put("2", hotelFeedbackOperation::findById);
    menuMethods.put("3", hotelFeedbackOperation::create);
    menuMethods.put("4", hotelFeedbackOperation::update);
    menuMethods.put("5", hotelFeedbackOperation::delete);
    return menuMethods;
  }


  private Map<String, Printable> generateHotelLocationMenuMethods() {
    Controller<HotelLocationEntity, Integer> hotelLocationController = new HotelLocationControllerImpl();
    Formatter<HotelLocationEntity, Integer> formatter = new Formatter<>(HotelLocationEntity.class);
    ViewOperations<HotelLocationEntity, Integer> hotelLocationOperation = new ViewOperations<>(hotelLocationController, formatter,
        HotelLocationEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", hotelLocationOperation::findAll);
    menuMethods.put("2", hotelLocationOperation::findById);
    menuMethods.put("3", hotelLocationOperation::create);
    menuMethods.put("4", hotelLocationOperation::update);
    menuMethods.put("5", hotelLocationOperation::delete);
    return menuMethods;
  }


  private Map<String, Printable> generateHotelRoomMenuMethods() {
    Controller<HotelRoomEntity, Integer> hotelRoomController = new HotelRoomControllerImpl();
    Formatter<HotelRoomEntity, Integer> formatter = new Formatter<>(HotelRoomEntity.class);
    ViewOperations<HotelRoomEntity, Integer> hotelRoomOperation = new ViewOperations<>(hotelRoomController,
        formatter, HotelRoomEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", hotelRoomOperation::findAll);
    menuMethods.put("2", hotelRoomOperation::findById);
    menuMethods.put("3", hotelRoomOperation::create);
    menuMethods.put("4", hotelRoomOperation::update);
    menuMethods.put("5", hotelRoomOperation::delete);
    return menuMethods;
  }


  private Map<String, Printable> generateHotelRoomTypeMenuMethods() {
    Controller<HotelRoomTypeEntity, Integer> hotelRoomTypeController = new HotelRoomTypeControllerImpl();
    Formatter<HotelRoomTypeEntity, Integer> formatter = new Formatter<>(HotelRoomTypeEntity.class);
    ViewOperations<HotelRoomTypeEntity, Integer> hotelRoomTypeOperation = new ViewOperations<>(hotelRoomTypeController, formatter,
        HotelRoomTypeEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", hotelRoomTypeOperation::findAll);
    menuMethods.put("2", hotelRoomTypeOperation::findById);
    menuMethods.put("3", hotelRoomTypeOperation::create);
    menuMethods.put("4", hotelRoomTypeOperation::update);
    menuMethods.put("5", hotelRoomTypeOperation::delete);
    return menuMethods;
  }


  private Map<String, Printable> generateUserMenuMethods() {
    Controller<UserEntity, Integer> userController = new UserControllerImpl();
    Formatter<UserEntity, Integer> formatter = new Formatter<>(UserEntity.class);
    ViewOperations<UserEntity, Integer> userOperation = new ViewOperations<>(userController, formatter, UserEntity.class);

    Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
    menuMethods.put("1", userOperation::findAll);
    menuMethods.put("2", userOperation::findById);
    menuMethods.put("3", userOperation::create);
    menuMethods.put("4", userOperation::update);
    menuMethods.put("5", userOperation::delete);
    return menuMethods;
  }


  private void showMenuFromMaps(Map<String, String> keyName, Map<String, Printable> keyMethod) {
    String keyMenu;
    do {
      printMenu(keyName);
      System.out.println(TEXT_SELECT_MENU_OPTION);
      keyMenu = input.nextLine().toUpperCase();
      Printable method = keyMethod.get(keyMenu);
      if (method != null) {
        method.print();
      } else if (!keyMenu.equals(KEY_EXIT)) {
        System.out.println(ERROR_NO_SUCH_OPTION);
      }
    } while (!keyMenu.equals(KEY_EXIT));
  }

  private void printMenu(Map<String, String> keyName) {
    for (String key : keyName.keySet()) {
      System.out.format("%3s - %s%n", key, keyName.get(key));
    }
    System.out.format("%3s - %s%n", KEY_EXIT, TEXT_GO_BACK);
  }
}
