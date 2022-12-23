package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class IUniswapV3FlashCallback extends Contract {
    public static final String BINARY = "";

    public static final String FUNC_UNISWAPV3FLASHCALLBACK = "uniswapV3FlashCallback";

    @Deprecated
    protected IUniswapV3FlashCallback(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected IUniswapV3FlashCallback(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected IUniswapV3FlashCallback(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected IUniswapV3FlashCallback(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3FlashCallback(BigInteger fee0, BigInteger fee1, byte[] data) {
        final Function function = new Function(
                FUNC_UNISWAPV3FLASHCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(fee0), 
                new org.web3j.abi.datatypes.generated.Uint256(fee1), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static IUniswapV3FlashCallback load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3FlashCallback(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static IUniswapV3FlashCallback load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3FlashCallback(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static IUniswapV3FlashCallback load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new IUniswapV3FlashCallback(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IUniswapV3FlashCallback load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new IUniswapV3FlashCallback(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<IUniswapV3FlashCallback> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3FlashCallback.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3FlashCallback> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3FlashCallback.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<IUniswapV3FlashCallback> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3FlashCallback.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3FlashCallback> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3FlashCallback.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
