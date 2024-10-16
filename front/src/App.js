import React, { useState } from 'react';
import Login from './Login';

const App = () => {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  const handleLogin = () => {
    setIsAuthenticated(true);
  };

  return (
    <div className="App">
      {isAuthenticated ? (
        <h1>Welcome to the Dashboard!</h1>
      ) : (
        <Login onLogin={handleLogin} />
      )}
    </div>
  );
};

export default App;
