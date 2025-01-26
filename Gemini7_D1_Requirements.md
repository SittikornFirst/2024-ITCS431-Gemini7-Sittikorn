# 2024-ITCS431-Gemini7

## Functional Requirements

### Astronomers
- Astronomers must be able to create science plans.
- Astronomers must be able to test science plans.
- Astronomers must be able to submit science plans.
- Astronomers must be able to monitor observations instantly, either remotely or on-site.
- Astronomers must be able to collect, validate, check data accuracy and completeness, and manage astronomical data.
- Astronomers must have access to a virtual telescope environment to simulate and test science plans.
- Astronomers must be able to automate observing programs using queue-based scheduling.
- Astronomers must be able to securely access and manage data while ensuring data integrity during and after observations.
- Astronomers should be able to send notes or instructions to science observers instantly using integrated communication tools such as chat systems or email notifications.

### Science Observers
- Science Observers must be able to transform science plans into executable observing programs.
- Science Observers must be able to execute and monitor observing programs.
- Science Observers must ensure data integrity during observation by continuously monitoring data quality, detecting anomalies, and implementing corrective actions when necessary.
- Science Observers must have access to instant monitoring tools for data acquisition and instrument performance.
- Science Observers must be able to adjust observing programs in response to changing conditions.

### Telescope Operators
- Telescope Operators must be able to operate and maintain the telescope and instruments.
- Telescope Operators must resolve operational issues and ensure system safety.
- Telescope Operators must have access to direct control interfaces for telescope and instrument operation.
- Telescope Operators must follow safety protocols, including using hardware stop buttons and system health checks.
- Telescope Operators must use automated tools for startup, shutdown, and instrument reconfiguration.

### Support Staff and Developers
- Support Staff and Developers must maintain, test, and configure subsystems.
- Support Staff and Developers must resolve issues and implement upgrades.
- Support Staff and Developers must have access to advanced system diagnostic tools that enable fault detection, initiate self-tests, and monitor subsystem health instantly.
- Support Staff and Developers must perform remote debugging and upgrades using remote access tools.
- Support Staff and Developers must use version control and testing environments to ensure compatibility with system updates.

### Administrators
- Administrators must oversee high-level operations and schedule changes.
- Administrators must have access to dashboards for viewing system utilization, operational schedules, and performance reports.
- Administrators must manage user privileges and define roles through privilege management tools.

## Non-Functional Requirements

### Performance Expectations
- Subsystems should respond to commands within 100-500 milliseconds.
- Observing systems should operate continuously during scheduled observation times with minimal downtime.
- Observing systems should have automated fault recovery mechanisms to maintain reliability.
- Data systems should provide fast data acquisition and storage with backup mechanisms.

### Security Expectations
- The system should define and enforce access privileges for each user role and operational level.
- The system should prevent unauthorized access to sensitive subsystems.
- The system should log all user activities, including commands, errors, and status inquiries, to ensure traceability.
- The system should use encrypted communication protocols for remote monitoring and control.
- The system should include safeguards to prevent remote access from affecting ongoing local operations.

### Usability Expectations
- Interfaces should be simple, intuitive, and tailored to the needs of each user group.
- Interfaces should have a consistent look-and-feel across subsystems while ensuring role-specific functionality.
- The system should support multiple observing modes.
- The system should provide clear documentation and training tools, especially for astronomers and operators unfamiliar with the system.

