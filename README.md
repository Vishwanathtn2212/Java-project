# Instructions to run this project in github codespace

## Pre-requisits
1) Java-8
2) Maven-3.9.6

## Steps to resolve GPG error

> Remove old Yarn repo
  ```
    sudo rm -f /etc/apt/sources.list.d/yarn.list
  ```
> Add Yarn GPS key correctly
  ```
    sudo mkdir -p /etc/apt/keyrings
    curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo gpg --dearmor -o /etc/apt/keyrings/yarn.gpg
  ```
> Add Yarn repository with signed-by option
  ```
    echo "deb [signed-by=/etc/apt/keyrings/yarn.gpg] https://dl.yarnpkg.com/debian stable main" | sudo tee /etc/apt/sources.list.d/yarn.list
  ```
> Note: Above steps are necessary to execute bleow command in github codespace
  ```
    sudo apt-get update
  ```


## Steps to install Java-8 in github codespace

> Install SDKMAN
  ```
    curl -s "https://get.sdkman.io" | bash
    source "$HOME/.sdkman/bin/sdkman-init.sh"
  ```
> Install Java-8
  ```
    sdk install java 8.0.392-tem
  ```
> Set Java-8 as default for all shell
  ```
    sdk default java 8.0.392-tem
  ```


## Steps to install Maven-3.9.6 in github codespace

> Install Maven 3.9.6
  ```
    sdk install maven 3.9.6
  ```
> Set Maven 3.9.6 as deafult for all shell
  ```
    sdk default java 8.0.392-tem
  ```

## To build poject in github codespace
  ```
    mvn clan package
  ```

## To run project in github codespace
  ```
    mvn spring-boot:run
  ```
