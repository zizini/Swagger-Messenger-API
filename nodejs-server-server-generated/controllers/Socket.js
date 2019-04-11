'use strict';

var utils = require('../utils/writer.js');
var Socket = require('../service/SocketService');

module.exports.socketUser_entered_WhatsAppPOST = function socketUser_entered_WhatsAppPOST (req, res, next) {
  Socket.socketUser_entered_WhatsAppPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
