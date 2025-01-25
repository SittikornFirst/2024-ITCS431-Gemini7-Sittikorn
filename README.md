# 2024-ITCS431-Gemini7
# README

## Functional Requirements

### Astronomers
- Must be able to create science plans.
- Must be able to test science plans.
- Must be able to submit science plans.
- Must be able to monitor observations instantly, either remotely or on-site.
- Must be able to collect, validate, check data accuracy and completeness, and manage astronomical data.
- Must have access to a virtual telescope environment to simulate and test science plans.
- Must be able to automate observing programs using queue-based scheduling.
- Must be able to securely access and manage data while ensuring data integrity during and after observations.
- Should be able to send notes or instructions to science observers instantly using integrated communication tools such as chat systems or email notifications.

### Science Observers
- Must be able to transform science plans into executable observing programs.
- Must be able to execute and monitor observing programs.
- Must ensure data integrity during observation by continuously monitoring data quality, detecting anomalies, and implementing corrective actions when necessary.
- Must have access to instant monitoring tools for data acquisition and instrument performance.
- Must be able to adjust observing programs in response to changing conditions.

### Telescope Operators
- Must be able to operate and maintain the telescope and instruments.
- Must resolve operational issues and ensure system safety.
- Must have access to direct control interfaces for telescope and instrument operation.
- Must follow safety protocols, including using hardware stop buttons and system health checks.
- Must use automated tools for startup, shutdown, and instrument reconfiguration.

### Support Staff and Developers
- Must maintain, test, and configure subsystems.
- Must resolve issues and implement upgrades.
- Must have access to advanced system diagnostic tools that enable fault detection, initiate self-tests, and monitor subsystem health instantly.
- Must perform remote debugging and upgrades using remote access tools.
- Must use version control and testing environments to ensure compatibility with system updates.

### Administrators
- Must oversee high-level operations and schedule changes.
- Must have access to dashboards for viewing system utilization, operational schedules, and performance reports.
- Must manage user privileges and define roles through privilege management tools.

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
- The system should use encrypted communication protocols (e.g., TCP/IP, ISDN) for remote monitoring and control.
- The system should include safeguards to prevent remote access from affecting ongoing local operations.

### Usability Expectations
- Interfaces should be simple, intuitive, and tailored to the needs of each user group.
- Interfaces should have a consistent look-and-feel across subsystems while ensuring role-specific functionality.
- The system should support multiple observing modes.
- The system should provide clear documentation and training tools, especially for astronomers and operators unfamiliar with the system.
