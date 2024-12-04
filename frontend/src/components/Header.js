import React from "react";

const Header = () => {
    return (
        <header style={styles.header}>
            <h1>Task Management App</h1>
        </header>
    );
};

const styles = {
    header: {
        background: "#007BFF",
        color: "white",
        padding: "10px",
        textAlign: "center",
    },
};

export default Header;
