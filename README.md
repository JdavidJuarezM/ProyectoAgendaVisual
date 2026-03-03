<div align="center">

# 📇 Proyecto Agenda Visual

**A Java Swing desktop application for visual contact management**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](#)
[![Apache Ant](https://img.shields.io/badge/Apache_Ant-E25A1C?style=for-the-badge&logo=apache&logoColor=white)](#)
[![NetBeans](https://img.shields.io/badge/NetBeans_IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](#)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](#)

*A complete CRUD (Create, Read, Update, Delete) desktop application developed with Java to manage personal contacts and agendas through an intuitive, multi-window graphical user interface.*

</div>

<br />

## 📑 Table of Contents
- [✨ Key Features](#-key-features)
- [🏗️ Architecture & Structure](#️-architecture--structure)
- [🚀 Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation & Execution](#installation--execution)
- [🤝 Contributing](#-contributing)

---

## ✨ Key Features

* **✔️ Full CRUD Operations:** Seamlessly add (`AgregarPersona`), search (`ConsultarPersona`), edit (`ModificarPersona`), and remove (`EliminarPersona`) contacts from the agenda.
* **✔️ Global Directory View:** Includes a general query view (`ConsultaGeneral`) to list and display all stored records at a glance.
* **✔️ Multi-Window UI:** Built entirely with Java Swing components (`JFrame`, `JPanel`), providing dedicated modal windows for each specific user action.
* **✔️ State Management:** Utilizes a centralized manager class (`Agenda`) to handle the underlying data structures and ensure UI consistency.

---

## 🏗️ Architecture & Structure

The project is structured to separate the core logic from the specific graphical interfaces:

```text
ProyectoAgendaVisual/
├── src/src/
│   ├── PruebaAgenda.java          # Main entry point and Master Menu UI
│   ├── Agenda.java                # Core business logic and contact collection
│   ├── Persona.java               # Data model (POJO)
│   ├── AgregarPersona.java        # GUI Form: Create new contact
│   ├── ModificarPersona.java      # GUI Form: Update existing contact
│   ├── EliminarPersona.java       # GUI Form: Delete contact
│   ├── ConsultarPersona.java      # GUI Form: Search specific contact
│   └── ConsultaGeneral.java       # GUI Form: View all contacts
├── nbproject/                     # NetBeans project configurations
├── .idea/                         # IntelliJ IDEA configurations
└── build.xml                      # Apache Ant build script
```

---

## 🚀 Getting Started

### Prerequisites

To run this project, ensure you have the following installed on your local machine:

* **Java Development Kit (JDK):** Version 8 or higher.
* **IDE:** NetBeans (highly recommended to interact with `.form` GUI builder files) or IntelliJ IDEA.
* **Apache Ant:** For command-line builds.

### Installation & Execution

#### Option 1: Using NetBeans IDE (Recommended)
1. Clone this repository to your local machine:
   ```bash
   git clone <your-repository-url>
   ```
2. Open **NetBeans IDE**.
3. Navigate to `File > Open Project` and select the cloned `ProyectoAgendaVisual` directory.
4. Right-click the project in the Project Explorer and select **Run** (or press `F6`).

#### Option 2: Command Line via Apache Ant
Open your terminal and navigate to the project root directory:
```bash
cd ProyectoAgendaVisual
```
Compile the source code and run the application:
```bash
ant compile
ant run
```

#### Option 3: Manual Compilation (Javac)
If you prefer to bypass build tools entirely, you can compile and run it directly:
```bash
# Create the build directory and compile
javac -d build src/src/*.java

# Execute the compiled Main class
java -cp build src.PruebaAgenda
```

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! If you'd like to improve this project (e.g., adding database persistence or file saving):

1. **Fork** the repository.
2. **Create** a new branch (`git checkout -b feature/DatabasePersistence`).
3. **Commit** your changes (`git commit -m 'Add SQLite integration'`).
4. **Push** to the branch (`git push origin feature/DatabasePersistence`).
5. Open a **Pull Request**.

<br />

<div align="center">
  <i>Developed with ☕ to explore GUI and CRUD operations in Java.</i>
</div>
